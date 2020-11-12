package bankaccount;

import bankaccount.notification.NotificationEngine;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Bank {

    private Account[] bankAccounts = new Account[100];
    // this is an application of Inversion of control principle (one of the SOLID principles)
    // Open for extension, close for modification principle
    private NotificationEngine[] notificationEngines;

    public Bank(NotificationEngine[] notificationEngines) {
        this.notificationEngines = notificationEngines;
    }

    public Account[] getBankAccounts() {
        return bankAccounts;
    }

    public void addBankAccount(Account account) {
        for(int i = 0; i < bankAccounts.length; i++) {
            if(bankAccounts[i] == null) {
                bankAccounts[i] = account;
                for(NotificationEngine notificationEngine : notificationEngines) {
                    notificationEngine.sendNotification(account);
                }
                break;
            }
        }
        System.out.println("Bank account successfully added.");
//
//        varianta cu while()
//
//        int i = 0;
//        while(i < bankAccounts.length) {
//            if(bankAccounts[i] == null) {
//                bankAccounts[i] = account;
//                break;
//            } else {
//                i++;
//            }
//        }
    }

    public void printBankAccounts() {
        for(int i = 0; i < bankAccounts.length; i++) {
            if(bankAccounts[i] != null) {
                System.out.println(bankAccounts[i]);
            } else {
                break;
            }
        }
    }

    public void searchBankAccount(String accountNumber) {
        for(Account a : bankAccounts) {
            if(a != null) {
                if(a.accountNumber.equals(accountNumber)) {
                    if(a instanceof DebitBankAccount) {
                        DebitBankAccount debitBankAccount = (DebitBankAccount) a;
                        System.out.println(debitBankAccount.getClass().getName() + " " + debitBankAccount);
                    } else if(a instanceof SavingsBankAccount) {
                        SavingsBankAccount savingsBankAccount = (SavingsBankAccount) a;
                        System.out.println(savingsBankAccount.getClass().getName() + " " + savingsBankAccount);
                    }
                }
            } else {
                break;
            }
        }
    }

    public void importBankAccounts() {
        Path path = Paths.get("C:/Curs Java Fundamentals/curs3/bankAcounts.txt");
        try {
            BufferedReader reader = Files.newBufferedReader(path);

            boolean endOfFile = false;
            while(!endOfFile) {
                String line = reader.readLine();
                if(line == null) {
                    endOfFile = true;
                } else {
                    String[] allBankAccountDetails = line.split("/");
                    String bankAccountType = allBankAccountDetails[0];

                    if("debit".equals(bankAccountType)) {
                        String[] bankAccountAttributeDetails = getDebitBankAccountAttributeDetails(allBankAccountDetails);
                        DebitBankAccount debitBankAccount = buildDebitBankAccount(bankAccountAttributeDetails);
                        addBankAccount(debitBankAccount);
                    } else if("savings".equals(bankAccountType)) {
                        String[] bankAccountAttributeDetails = getSavingsBankAccountAttributeDetails(allBankAccountDetails);
                        SavingsBankAccount savingsBankAccount = buildSavingsBankAccount(bankAccountAttributeDetails);
                        addBankAccount(savingsBankAccount);
                    } else {
                        throw new RuntimeException("Incorrect bank account type.");
                    }
                }
            }
//            String line = "";
//            while ( (line = reader.readLine()) != null ) {
//               line.split();
//            }
        } catch(IOException e){
            System.out.println("Exception while reading from file: " + e.getMessage());
        } finally {
            System.out.println("Done importing from the file.");
        }
    }

    private String[] getDebitBankAccountAttributeDetails(String[] bankAccountDetails) {
        if (bankAccountDetails != null && bankAccountDetails.length == DebitBankAccount.NUMBER_OF_ATTRIBUTES + 1) {
            return new String[]{bankAccountDetails[1], bankAccountDetails[2],
                    bankAccountDetails[3], bankAccountDetails[4]};
        } else {
            throw new RuntimeException("Incorrect mandatory details for the bank account. Needed: " +
                    DebitBankAccount.NUMBER_OF_ATTRIBUTES + ", but it was " + (bankAccountDetails.length - 1));
        }
    }

    public DebitBankAccount buildDebitBankAccount(String[] bankAccountDetails) {
        if (bankAccountDetails != null && bankAccountDetails.length == DebitBankAccount.NUMBER_OF_ATTRIBUTES) {
            double balance = Double.parseDouble(bankAccountDetails[0]);
            String accountNumber = bankAccountDetails[1];
            String cardNumber = bankAccountDetails[2];
            double withdrawalLimit = Double.parseDouble(bankAccountDetails[3]);

            return new DebitBankAccount(balance, accountNumber, cardNumber, withdrawalLimit);
        } else {
            throw new RuntimeException("Incorrect mandatory details for the bank account. Needed: " +
                    DebitBankAccount.NUMBER_OF_ATTRIBUTES + ", but it was " + bankAccountDetails.length);
        }
    }

    private String[] getSavingsBankAccountAttributeDetails(String[] bankAccountDetails) {
        if(bankAccountDetails != null && bankAccountDetails.length == SavingsBankAccount.NUMBER_OF_ATTRIBUTES + 1) {
            return new String[]{bankAccountDetails[1], bankAccountDetails[2],
                    bankAccountDetails[3]};
        } else {
            throw new RuntimeException("Incorrect mandatory details for the bank account. Needed: " +
                    SavingsBankAccount.NUMBER_OF_ATTRIBUTES + ", but it was " + (bankAccountDetails.length - 1));
        }
    }

    public SavingsBankAccount buildSavingsBankAccount(String[] bankAccountDetails) {
        if(bankAccountDetails != null && bankAccountDetails.length == SavingsBankAccount.NUMBER_OF_ATTRIBUTES) {
            double balance = Double.parseDouble(bankAccountDetails[0]);
            String accountNumber = bankAccountDetails[1];
            int term = Integer.parseInt(bankAccountDetails[2]);

            return new SavingsBankAccount(balance, accountNumber, term);
        } else {
            throw new RuntimeException("Incorrect mandatory details for the bank account. Needed: " +
                    SavingsBankAccount.NUMBER_OF_ATTRIBUTES + ", but it was " + bankAccountDetails.length);
        }
    }











}
