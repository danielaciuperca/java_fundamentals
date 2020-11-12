package bankaccount;

public class SavingsBankAccount extends Account {
    private int term;

    public SavingsBankAccount(double balance, String accountNumber, int term) {
        super(balance, accountNumber);
        this.term = term;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return super.toString() + " / " + term;
    }

    @Override
    public void close() {
        System.out.println("Savings bank account was closed.");
    }
}
