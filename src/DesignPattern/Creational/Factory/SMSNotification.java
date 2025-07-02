package DesignPattern.Creational.Factory;

// Concrete Product: SMSNotification
public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS Notification");
    }
}
