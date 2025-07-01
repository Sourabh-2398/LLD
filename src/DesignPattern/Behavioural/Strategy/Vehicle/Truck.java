package DesignPattern.Behavioural.Strategy.Vehicle;

import DesignPattern.Behavioural.Strategy.DriveStrategy.DriveStrategy;

public class Truck extends Vehicle {
    public Truck() {
        super(new DriveStrategy());
        this.hasGear = false;
        this.fuelType = "Diesel";
    }
}

