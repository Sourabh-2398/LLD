package DesignPattern.Creational.AbstractFactory;

import DesignPattern.Creational.AbstractFactory.ClassicVehicle.ClassicVehicleFactory;
import DesignPattern.Creational.AbstractFactory.LuxurayVehicle.LuxuryVehicleFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Create luxury vehicles
        VehicleFactory luxuryFactory = new LuxuryVehicleFactory();
        Car luxuryCar = luxuryFactory.createCar();
        Bike luxuryBike = luxuryFactory.createBike();
        luxuryCar.drive();
        luxuryBike.ride();

        // Create classic vehicles
        VehicleFactory classicFactory = new ClassicVehicleFactory();
        Car classicCar = classicFactory.createCar();
        Bike classicBike = classicFactory.createBike();
        classicCar.drive();
        classicBike.ride();
    }
}
