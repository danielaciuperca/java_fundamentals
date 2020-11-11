package bankaccount.notification;

import bankaccount.Account;

public class EmailNotificationEngine implements NotificationEngine {
    @Override
    public void sendNotification(Account account) {
        System.out.println("Email was send for bank account with account number " +
                account.getAccountNumber());
    }
}
