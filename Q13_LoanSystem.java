abstract class Loan {
    private double amount;
    public Loan(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid loan amount");
        this.amount = amount;
    }
    public double getAmount() { return amount; }
    public abstract double calculateInterest();
}

class HomeLoan extends Loan {
    public HomeLoan(double amount) { super(amount); }
    public double calculateInterest() { return getAmount() * 0.08; }
}

class CarLoan extends Loan {
    public CarLoan(double amount) { super(amount); }
    public double calculateInterest() { return getAmount() * 0.07; }
}

class EducationLoan extends Loan {
    public EducationLoan(double amount) { super(amount); }
    public double calculateInterest() { return getAmount() * 0.05; }
}

public class Q13_LoanSystem {
    public static void main(String[] args) {
        try {
            Loan l1 = new HomeLoan(200000);
            Loan l2 = new CarLoan(50000);
            Loan l3 = new EducationLoan(30000);
            System.out.println("Home Loan Interest: " + l1.calculateInterest());
            System.out.println("Car Loan Interest: " + l2.calculateInterest());
            System.out.println("Education Loan Interest: " + l3.calculateInterest());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
