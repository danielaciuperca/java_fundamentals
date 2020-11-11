package bankaccount.notification;

import bankaccount.Account;

public class SmsNotificationEngine implements NotificationEngine {
    @Override
    public void sendNotification(Account account) {
        System.out.println("SMS was send for bank account with account number " +
                account.getAccountNumber());
    }
}
