package SOLID;

// Concrete payment methods (OCP, LSP)
public class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

