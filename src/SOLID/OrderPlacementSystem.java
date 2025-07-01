package SOLID;

// Main class to run the example
public class Main {
    public static void main(String[] args) {
        Order order = new Order(100.0);
        PaymentMethod payment = new CreditCardPayment();
        Printer printer = new OrderPrinter();
        Repository repository = new OrderRepository();

        OrderProcessor processor = new OrderProcessor(payment, printer, repository);
        processor.process(order);
    }
}