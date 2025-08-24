abstract class Payment {
    public abstract void processPayment(double amount);
}

class CreditCard extends Payment {
    public void processPayment(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
        System.out.println("Paid " + amount + " via Credit Card");
    }
}

class UPI extends Payment {
    public void processPayment(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
        System.out.println("Paid " + amount + " via UPI");
    }
}

class NetBanking extends Payment {
    public void processPayment(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
        System.out.println("Paid " + amount + " via Net Banking");
    }
}

public class Q10_PaymentGateway {
    public static void main(String[] args) {
        try {
            Payment p1 = new CreditCard();
            Payment p2 = new UPI();
            Payment p3 = new NetBanking();
            p1.processPayment(500);
            p2.processPayment(300);
            p3.processPayment(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
