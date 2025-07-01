package DesignPattern.Behavioural.Strategy.Vehicle;

import DesignPattern.Behavioural.Strategy.DriveStrategy.MoveStrategy;

public abstract class Vehicle {
    protected MoveStrategy moveStrategy;
    protected boolean hasGear;
    protected String fuelType;

    public Vehicle(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void move() {
        moveStrategy.move();
    }

    public boolean hasGear() {
        return hasGear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }
}

