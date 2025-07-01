package DesignPattern.Behavioural.Strategy.Vehicle;

import DesignPattern.Behavioural.Strategy.DriveStrategy.DriveStrategy;

public class Bus extends Vehicle {
    public Bus() {
        super(new DriveStrategy());
        this.hasGear = false;
        this.fuelType = "Diesel";
    }
}

