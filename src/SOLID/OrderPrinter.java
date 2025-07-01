package SOLID;

// Implementations (SRP, ISP)
public class OrderPrinter implements Printer {
    public void print(Order order) {
        System.out.println("Order amount: " + order.getAmount());
    }
}
