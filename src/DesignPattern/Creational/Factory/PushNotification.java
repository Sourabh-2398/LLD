package DesignPattern.Creational.Factory;

// Concrete Product: PushNotification
public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push Notification");
    }
}
