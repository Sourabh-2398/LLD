package DesignPattern.Behavioural.Observer.notifyme;

import DesignPattern.Behavioural.Observer.observer.Observer;

public class EmailObserver implements Observer<Product> {
    private String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(Product product) {
        if (product.isInStock()) {
            System.out.println("Email sent to " + email + ": Product '" + product.getName() + "' is now back in stock!");
        }
    }
}

