package Functional_interface;


interface Payment {
    void pay(double amount);
}


class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("📱 Paid ₹" + amount + " via UPI.");
    }
}


class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("💳 Paid ₹" + amount + " via Credit Card.");
    }
}


class Wallet implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("👛 Paid ₹" + amount + " via Wallet.");
    }
}

// Main class
public class DigitalPaymentSystem {
    public static void main(String[] args) {
       
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        System.out.println("=== Digital Payment System ===");
        upi.pay(500.0);
        card.pay(1200.0);
        wallet.pay(300.0);
    }
}
