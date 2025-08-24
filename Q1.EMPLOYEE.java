abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        if (salary < 0) throw new IllegalArgumentException("Invalid salary");
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    public abstract double calculateSalary();
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }
    public double calculateSalary() {
        return getSalary() + 5000;
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }
    public double calculateSalary() {
        return getSalary() + 3000;
    }
}

public class Emplyee {
    public static void main(String[] args) {
        try {
            Employee e1 = new Manager("Ram", 40000);
            Employee e2 = new Developer("Shyam", 35000);
            System.out.println(e1.getName() + " Salary: " + e1.calculateSalary());
            System.out.println(e2.getName() + " Salary: " + e2.calculateSalary());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
