package SOLID;

// Concrete payment methods (OCP, LSP)
public class PayPalPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
