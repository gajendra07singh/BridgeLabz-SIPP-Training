interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed (default)");
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) { System.out.println("Paid via PayPal: " + amount); }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        paypal.processPayment(200);
        paypal.refund(100);
    }
}