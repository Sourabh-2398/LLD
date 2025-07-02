package DesignPattern.Creational.AbstractFactory.LuxurayVehicle;

import DesignPattern.Creational.AbstractFactory.Bike;
import DesignPattern.Creational.AbstractFactory.Car;
import DesignPattern.Creational.AbstractFactory.VehicleFactory;

// Concrete Factory: LuxuryVehicleFactory
public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new LuxuryCar();
    }
    @Override
    public Bike createBike() {
        return new LuxuryBike();
    }
}
