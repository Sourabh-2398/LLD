package DesignPattern.Behavioural.Strategy.DriveStrategy;

public class DriveStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Driving on road");
    }
}

