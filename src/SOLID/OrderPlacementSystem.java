package SOLID;

// Main class to run the example
public class OrderPlacementSystem {
    public static void main(String[] args) {
        Order order = new Order(1000.0);
        PaymentMethod payment = new CreditCardPayment();
        Printer printer = new OrderPrinter();
        Repository repository = new OrderRepository();

        OrderProcessor processor = new OrderProcessor(payment, printer, repository);
        processor.process(order);
    }
}