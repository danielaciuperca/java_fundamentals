package bankaccount.notification;

import bankaccount.Account;

public interface NotificationEngine {
    void sendNotification(Account account);
}
