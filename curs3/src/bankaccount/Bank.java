package bankaccount;

public class Bank {

    private Account[] bankAccounts = new Account[100];

    public Account[] getBankAccounts() {
        return bankAccounts;
    }

    public void addBankAccount(Account account) {
        for(Account a : bankAccounts) {
            if(a == null) {
                a = account;
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
}
