abstract class InsurancePolicy {
    private int age;
    private double coverage;

    public InsurancePolicy(int age, double coverage) {
        if (age <= 0 || coverage <= 0) throw new IllegalArgumentException("Invalid data");
        this.age = age;
        this.coverage = coverage;
    }

    public int getAge() { return age; }
    public double getCoverage() { return coverage; }
    public abstract double calculatePremium();
}

class HealthInsurance extends InsurancePolicy {
    public HealthInsurance(int age, double coverage) { super(age, coverage); }
    public double calculatePremium() { return getCoverage() * 0.02; }
}

class LifeInsurance extends InsurancePolicy {
    public LifeInsurance(int age, double coverage) { super(age, coverage); }
    public double calculatePremium() { return getCoverage() * 0.03; }
}

class TravelInsurance extends InsurancePolicy {
    public TravelInsurance(int age, double coverage) { super(age, coverage); }
    public double calculatePremium() { return getCoverage() * 0.01; }
}

public class Q18_InsuranceSystem {
    public static void main(String[] args) {
        try {
            InsurancePolicy p1 = new HealthInsurance(30, 200000);
            InsurancePolicy p2 = new LifeInsurance(40, 500000);
            InsurancePolicy p3 = new TravelInsurance(25, 100000);
            System.out.println("Health Premium: " + p1.calculatePremium());
            System.out.println("Life Premium: " + p2.calculatePremium());
            System.out.println("Travel Premium: " + p3.calculatePremium());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
