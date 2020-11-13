package bankaccount;

import java.util.Comparator;

public class AccountComparatorByAccountNumber implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return o1.accountNumber.compareTo(o2.accountNumber);
    }
}
