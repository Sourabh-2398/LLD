package DesignPattern.Behavioural.Observer;

import DesignPattern.Behavioural.Observer.observer.EmailObserver;
import DesignPattern.Behavioural.Observer.observable.Product;
import DesignPattern.Behavioural.Observer.observer.SMSObserver;
import DesignPattern.Behavioural.Observer.observer.Observer;

public class NotifyMeDemo {
    public static void main(String[] args) {
        Product product = new Product("iPhone 15");

        Observer<Product> user1 = new EmailObserver("user1@example.com");
        Observer<Product> user2 = new SMSObserver("+911234567890");
        Observer<Product> user3 = new EmailObserver("user3@example.com");

        // Users click 'Notify Me' and are added as observers
        product.addObserver(user1);
        product.addObserver(user2);
        product.addObserver(user3);

        // Product is restocked
        System.out.println("Restocking product...");
        product.restock();
    }
}

