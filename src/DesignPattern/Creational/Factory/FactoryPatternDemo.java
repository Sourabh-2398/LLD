package DesignPattern.Creational.Factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Notification email = NotificationFactory.createNotification("EMAIL");
        email.notifyUser();

        Notification sms = NotificationFactory.createNotification("SMS");
        sms.notifyUser();

        Notification push = NotificationFactory.createNotification("PUSH");
        push.notifyUser();
    }
}
