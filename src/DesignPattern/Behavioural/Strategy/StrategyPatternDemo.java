package DesignPattern.Behavioural.Strategy;

import DesignPattern.Behavioural.Strategy.DriveStrategy.RideStrategy;
import DesignPattern.Behavioural.Strategy.Vehicle.*;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();
        Vehicle bus = new Bus();
        Vehicle bicycle = new Bicycle();

        System.out.println("--- Vehicle Movements ---");
        car.move();
        bike.move();
        truck.move();
        bus.move();
        bicycle.move();

        System.out.println("\n--- Changing Bicycle's Move Strategy to Ride ---");
        bicycle.setMoveStrategy(new RideStrategy());
        bicycle.move();
    }
}

