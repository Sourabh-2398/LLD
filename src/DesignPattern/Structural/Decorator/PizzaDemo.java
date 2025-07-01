package DesignPattern.Structural.Decorator;

import DesignPattern.Structural.Decorator.BaseItem.BasePizza;
import DesignPattern.Structural.Decorator.BaseItem.Pizza;
import DesignPattern.Structural.Decorator.DecoratedItem.ExtraCheeseDecorator;
import DesignPattern.Structural.Decorator.DecoratedItem.VeggiePizzaDecorator;

public class PizzaDemo {
    public static void main(String[] args) {
        Pizza basePizza = new BasePizza();
        System.out.println(basePizza.getDescription() + " | Cost: Rs" + basePizza.getCost());

        Pizza veggiePizza = new VeggiePizzaDecorator(new BasePizza());
        System.out.println(veggiePizza.getDescription() + " | Cost: Rs" + veggiePizza.getCost());

        Pizza cheesePizza = new ExtraCheeseDecorator(new BasePizza());
        System.out.println(cheesePizza.getDescription() + " | Cost: Rs" + cheesePizza.getCost());

        Pizza veggieCheesePizza = new ExtraCheeseDecorator(new VeggiePizzaDecorator(new BasePizza()));
        System.out.println(veggieCheesePizza.getDescription() + " | Cost: Rs" + veggieCheesePizza.getCost());
    }
}
