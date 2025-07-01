package DesignPattern.Structural.Decorator.DecoratedItem;

import DesignPattern.Structural.Decorator.BaseItem.Pizza;

// ExtraCheeseDecorator.java
public class ExtraCheeseDecorator extends PizzaDecorator {
    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}
