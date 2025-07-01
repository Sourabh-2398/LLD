package SOLID;

// OrderProcessor depends on abstractions (DIP)
public class OrderProcessor {
    private PaymentMethod paymentMethod;
    private Printer printer;
    private Repository repository;

    public OrderProcessor(PaymentMethod paymentMethod, Printer printer, Repository repository) {
        this.paymentMethod = paymentMethod;
        this.printer = printer;
        this.repository = repository;
    }

    public void process(Order order) {
        paymentMethod.pay(order.getAmount());
        printer.print(order);
        repository.save(order);
    }
}
