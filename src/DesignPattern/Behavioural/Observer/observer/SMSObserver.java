package DesignPattern.Behavioural.Observer.notifyme;

import DesignPattern.Behavioural.Observer.observer.Observer;

public class SMSObserver implements Observer<Product> {
    private String phoneNumber;

    public SMSObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Product product) {
        if (product.isInStock()) {
            System.out.println("SMS sent to " + phoneNumber + ": Product '" + product.getName() + "' is now back in stock!");
        }
    }
}

