package collectionsframework;

import bankaccount.Account;
import bankaccount.DebitBankAccount;
import bankaccount.SavingsBankAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            Collections Framework

         */

        Account[] accounts1 = new Account[5];

        List<Account> accounts = new ArrayList<>();
        accounts.add(new DebitBankAccount(1000, "12345", "123 456 798 456", 2000));
        accounts.add(new SavingsBankAccount(5600, "97845", 5));

        System.out.println(accounts.get(0));
        System.out.println(accounts.size());

        for(Account a : accounts) {
            System.out.println(a);
        }

        //Wrapper classes: Short, Byte, Integer, Long, Float, Double, Boolean, Character

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(new Integer(7));

    }
}
