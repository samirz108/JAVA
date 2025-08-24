abstract class TaxPayer {
    private double income;
    public TaxPayer(double income) {
        if (income < 0) throw new IllegalArgumentException("Invalid income");
        this.income = income;
    }
    public double getIncome() { return income; }
    public abstract double calculateTax();
}

class Individual extends TaxPayer {
    public Individual(double income) { super(income); }
    public double calculateTax() { return getIncome() * 0.1; }
}

class Business extends TaxPayer {
    public Business(double income) { super(income); }
    public double calculateTax() { return getIncome() * 0.25; }
}

class Freelancer extends TaxPayer {
    public Freelancer(double income) { super(income); }
    public double calculateTax() { return getIncome() * 0.15; }
}

public class Q15_TaxSystem {
    public static void main(String[] args) {
        try {
            TaxPayer t1 = new Individual(40000);
            TaxPayer t2 = new Business(200000);
            TaxPayer t3 = new Freelancer(50000);
            System.out.println("Individual Tax: " + t1.calculateTax());
            System.out.println("Business Tax: " + t2.calculateTax());
            System.out.println("Freelancer Tax: " + t3.calculateTax());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
