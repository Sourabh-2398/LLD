package SOLID;

// Implementations (SRP, ISP)
public class OrderRepository implements Repository {
    public void save(Order order) {
        System.out.println("Order saved with amount: " + order.getAmount());
    }
}
