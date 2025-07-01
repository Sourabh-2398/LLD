package DesignPattern.Behavioural.Strategy.Vehicle;

import DesignPattern.Behavioural.Strategy.DriveStrategy.RideStrategy;

public class Bike extends Vehicle {
    public Bike() {
        super(new RideStrategy());
        this.hasGear = true;
        this.fuelType = "Petrol";
    }
}

