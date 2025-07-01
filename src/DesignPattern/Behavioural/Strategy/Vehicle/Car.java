package DesignPattern.Behavioural.Strategy.Vehicle;

import DesignPattern.Behavioural.Strategy.DriveStrategy.DriveStrategy;

public class Car extends Vehicle {
    public Car() {
        super(new DriveStrategy());
        this.hasGear = true;
        this.fuelType = "Petrol";
    }
}

