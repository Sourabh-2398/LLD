package DesignPattern.Creational.AbstractFactory.ClassicVehicle;

import DesignPattern.Creational.AbstractFactory.Bike;

// Concrete Product: ClassicBike
public class ClassicBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding a classic bike.");
    }
}
