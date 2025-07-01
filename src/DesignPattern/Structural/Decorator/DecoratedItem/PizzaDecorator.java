package DesignPattern.Structural.Decorator.DecoratedItem;

import DesignPattern.Structural.Decorator.BaseItem.Pizza;

// PizzaDecorator.java
public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
