package DesignPattern.Creational.AbstractFactory.LuxurayVehicle;

import DesignPattern.Creational.AbstractFactory.Car;

// Concrete Product: LuxuryCar
public class LuxuryCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a luxury car.");
    }
}
