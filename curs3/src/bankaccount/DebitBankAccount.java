package bankaccount;

public class DebitBankAccount extends Account {
    public static final int NUMBER_OF_ATTRIBUTES = 4;

    private String cardNumber;
    private double withdrawalLimit;

    public DebitBankAccount(double balance, String accountNumber, String cardNumber, double withdrawalLimit) {
        super(balance, accountNumber);
        this.cardNumber = cardNumber;
        this.withdrawalLimit = withdrawalLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public String toString() {
        return super.toString() + " / " + this.cardNumber + " / " + withdrawalLimit;
    }

    @Override
    public void close() {
        System.out.println("Debit bank account was closed. The attached card was also closed.");
    }
}
