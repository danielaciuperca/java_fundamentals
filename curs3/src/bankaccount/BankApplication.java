package bankaccount;

import java.util.Scanner;

public class BankApplication {

    private static Bank bank = new Bank();

    public static void main(String[] args) {
        /*

            Please type command: add
            What type of bank account do you want to add? debit
            Please type the bank account details: 1000/12345/4561 4566 4897 8965/8000

            Please type command: print
            1000/12345/4561 4566 4897 8965/8000
            1000/12345/4561 4566 4897 8965/8000
            1000/12345/4561 4566 4897 8965/8000

            Please type "Exit" in order to exit the application

         */

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please type add in order to add a bank account");
        System.out.println("Please type print in order to view the details of all bank accounts");
        System.out.println("Please type exit in order to exit the application");

        while(true) {

            String line = scanner.nextLine();

            switch(line) {
                case "exit" :
                    System.out.println("Session will be closed. Bye bye!");
                    System.exit(0);
                    break;
                case "add" :
                    addBankAccounts(scanner);
                    break;
                case "print" :
                    //print details of all bank accounts
                    break;
                default : System.out.println("Command doesn't exist.");
            }
        }

    }

    private static void addBankAccounts(Scanner scanner) {
        System.out.println("Choose the type of bank account you want to add, between debit and savings:");
        String accountType = scanner.nextLine();
        if("debit".equals(accountType)) {
            System.out.println("Please type the bank account details:");
            String inputDetails = scanner.nextLine();
            String[] bankAccountDetails = inputDetails.split("/");
            double balance = Double.parseDouble(bankAccountDetails[0]);
            String accountNumber = bankAccountDetails[1];
            String cardNumber = bankAccountDetails[2];
            double withdrawalLimit = Double.parseDouble(bankAccountDetails[3]);

            DebitBankAccount debitBankAccount = new DebitBankAccount(balance, accountNumber, cardNumber, withdrawalLimit);
            bank.addBankAccount(debitBankAccount);
        } else if("savings".equals(accountType)) {
            //add savings bank account

        } else {
            System.out.println("The bank account type is not valid");
        }
    }












}
