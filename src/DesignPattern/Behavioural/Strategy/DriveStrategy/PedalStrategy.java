package DesignPattern.Behavioural.Strategy.DriveStrategy;

public class PedalStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Pedaling on road");
    }
}

