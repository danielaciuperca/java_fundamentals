package bankaccount;

import bankaccount.notification.NotificationEngine;

public class Bank {

    private Account[] bankAccounts = new Account[100];
    // this is an application of Inversion of control principle (one of the SOLID principles)
    // Open for extension, close for modification principle
    private NotificationEngine notificationEngine; //TODO implement list of notifications

    public Bank(NotificationEngine notificationEngine) {
        this.notificationEngine = notificationEngine;
    }

    public Account[] getBankAccounts() {
        return bankAccounts;
    }

    public void addBankAccount(Account account) {
        for(int i = 0; i < bankAccounts.length; i++) {
            if(bankAccounts[i] == null) {
                bankAccounts[i] = account;
                notificationEngine.sendNotification(account);
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









}
