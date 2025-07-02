package DesignPattern.Creational.Factory;

// Concrete Product: EmailNotification
public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification");
    }
}
