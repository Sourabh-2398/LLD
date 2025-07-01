package DesignPattern.Structural.Decorator.BaseItem;

public class BasePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Base Pizza";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
