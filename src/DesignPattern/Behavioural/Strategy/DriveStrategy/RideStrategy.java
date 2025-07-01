package DesignPattern.Behavioural.Strategy.DriveStrategy;

public class RideStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Riding on road");
    }
}

