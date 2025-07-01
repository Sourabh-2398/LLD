package DesignPattern.Behavioural.Observer.observable;

import DesignPattern.Behavioural.Observer.observer.Observer;

public interface Observable<T> {
    void addObserver(Observer<T> observer);
    void removeObserver(Observer<T> observer);
    void notifyObservers();
}

