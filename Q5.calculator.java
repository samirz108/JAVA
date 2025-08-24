class Calculator {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }

    public int subtract(int a, int b) { return a - b; }
    public double subtract(double a, double b) { return a - b; }

    public int multiply(int a, int b) { return a * b; }
    public double multiply(double a, double b) { return a * b; }

    public double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }
}

public class Q5_Calculator {
    public static void main(String[] args) {
        try {
            Calculator c = new Calculator();
            System.out.println("Add: " + c.add(5, 3));
            System.out.println("Divide: " + c.divide(10, 2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
