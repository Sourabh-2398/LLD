// VeggiePizzaDecorator.java
public class VeggiePizzaDecorator extends PizzaDecorator {
    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Veggie";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}

