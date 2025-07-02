package DesignPattern.Creational.AbstractFactory.LuxurayVehicle;

import DesignPattern.Creational.AbstractFactory.Bike;

// Concrete Product: LuxuryBike
public class LuxuryBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding a luxury bike.");
    }
}
