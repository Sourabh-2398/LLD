package DesignPattern.Behavioural.Observer.observable;

import DesignPattern.Behavioural.Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Observable<Product> {
    private String name;
    private boolean inStock;
    private List<Observer<Product>> observers = new ArrayList<>();

    public Product(String name) {
        this.name = name;
        this.inStock = false;
    }

    public void addObserver(Observer<Product> observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer<Product> observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer<Product> observer : observers) {
            observer.update(this);
        }
    }

    public void restock() {
        this.inStock = true;
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public boolean isInStock() {
        return inStock;
    }
}

