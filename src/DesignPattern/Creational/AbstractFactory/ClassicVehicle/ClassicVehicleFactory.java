package DesignPattern.Creational.AbstractFactory.ClassicVehicle;

import DesignPattern.Creational.AbstractFactory.Bike;
import DesignPattern.Creational.AbstractFactory.Car;
import DesignPattern.Creational.AbstractFactory.VehicleFactory;

// Concrete Factory: ClassicVehicleFactory
public class ClassicVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new ClassicCar();
    }
    @Override
    public Bike createBike() {
        return new ClassicBike();
    }
}
