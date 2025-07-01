package DesignPattern.Behavioural.Strategy.Vehicle;

import DesignPattern.Behavioural.Strategy.DriveStrategy.PedalStrategy;

public class Bicycle extends Vehicle {
    public Bicycle() {
        super(new PedalStrategy());
        this.hasGear = true;
        this.fuelType = "None";
    }
}

