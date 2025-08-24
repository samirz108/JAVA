class EmployeeBase {
    private String name;
    private double salary;

    public EmployeeBase(String name, double salary) {
        if (salary < 0) throw new IllegalArgumentException("Invalid salary");
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    public double calculateBonus() { return 0; } // will be overridden
}

class PermanentEmployee extends EmployeeBase {
    public PermanentEmployee(String name, double salary) {
        super(name, salary);
    }
    public double calculateBonus() { return getSalary() * 0.2; }
}

class ContractEmployee extends EmployeeBase {
    public ContractEmployee(String name, double salary) {
        super(name, salary);
    }
    public double calculateBonus() { return getSalary() * 0.1; }
}

public class Q11_EmployeeBonus {
    public static void main(String[] args) {
        try {
            EmployeeBase e1 = new PermanentEmployee("Sita", 50000);
            EmployeeBase e2 = new ContractEmployee("Hari", 30000);
            System.out.println(e1.getName() + " Bonus: " + e1.calculateBonus());
            System.out.println(e2.getName() + " Bonus: " + e2.calculateBonus());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
