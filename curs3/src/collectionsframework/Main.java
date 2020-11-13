package collectionsframework;

import bankaccount.Account;
import bankaccount.AccountComparatorByAccountNumber;
import bankaccount.DebitBankAccount;
import bankaccount.SavingsBankAccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
            Collections Framework

         */

        //1. List implementations
        System.out.println("List implementations");
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
        numbers.add(8);
        numbers.add(4);
        numbers.add(8);

        for(Integer i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("");


        //2. Set implementations
        System.out.println("Set implementations");

        Set<Integer> set1 = new HashSet<>(); //nu pastreaza elementele in nicio ordine
        set1.add(7);
        set1.add(9);
        set1.add(6);
        set1.add(6);
        set1.add(0);
        set1.add(1);

        for(Integer i : set1) {
            System.out.print(i + " ");
        }
        System.out.println("");


        Set<Integer> set2 = new LinkedHashSet<>(); //pastreaza elementele ordonate in ordinea adaugarii lor in set
        set2.add(7);
        set2.add(9);
        set2.add(6);
        set2.add(6);
        set2.add(0);
        set2.add(1);

        for(Integer i : set2) {
            System.out.print(i + " ");
        }
        System.out.println("");

        Set<Integer> set3 = new TreeSet<>(); //pastreaza elementele sortate
        set3.add(7);
        set3.add(9);
        set3.add(6);
        set3.add(6);
        set3.add(0);
        set3.add(1);

        for(Integer i : set3) {
            System.out.print(i + " ");
        }
        System.out.println("");

        Set<Account> sortedBankAccounts = new TreeSet<>();
        sortedBankAccounts.add(new DebitBankAccount(1500, "1234", "124 456 789 456", 5000));
        sortedBankAccounts.add(new DebitBankAccount(500, "6895", "124 456 789 456", 5000));
        sortedBankAccounts.add(new SavingsBankAccount(850, "3647", 7));
        sortedBankAccounts.add(new SavingsBankAccount(300, "888", 6));

        System.out.println("Bank accounts sorted by balance");
        for(Account a : sortedBankAccounts) {
            System.out.println(a);
        }


        Set<Account> sortedByAccountNumberBankAccounts = new TreeSet<>(new AccountComparatorByAccountNumber());
        sortedByAccountNumberBankAccounts.add(new DebitBankAccount(1500, "1234", "124 456 789 456", 5000));
        sortedByAccountNumberBankAccounts.add(new DebitBankAccount(500, "6895", "124 456 789 456", 5000));
        sortedByAccountNumberBankAccounts.add(new SavingsBankAccount(850, "3647", 7));
        sortedByAccountNumberBankAccounts.add(new SavingsBankAccount(300, "888", 6));

        System.out.println("Bank accounts sorted by account number");
        for(Account a : sortedByAccountNumberBankAccounts) {
            System.out.println(a);
        }

        //3. Map implementations
        System.out.println("Map implementations");
        Map<String, Integer> cities = new HashMap<>();
        cities.put("Bucuresti", 2000000);
        cities.put("Brasov", 500000);
        cities.put("Iasi", 800000);
        cities.put("Bucuresti", 2100000); // se suprascrie valoarea existenta de la cheia "Bucuresti"

        System.out.println("Nr locuitori din Brasov: " + cities.get("Brasov"));

        for(String cityName : cities.keySet()) {
            System.out.println(cityName + " - " + cities.get(cityName));
        }

        Map<String, Integer> citiesCopy = new HashMap<>(cities);
        citiesCopy.putAll(cities);
        

    }
}
