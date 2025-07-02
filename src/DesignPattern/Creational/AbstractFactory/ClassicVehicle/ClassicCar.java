package DesignPattern.Creational.AbstractFactory.ClassicVehicle;

import DesignPattern.Creational.AbstractFactory.Car;

// Concrete Product: ClassicCar
public class ClassicCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a classic car.");
    }
}
