abstract class Person {
    private String name;
    public Person(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Invalid name");
        this.name = name;
    }
    public String getName() { return name; }
}

class Doctor extends Person {
    public Doctor(String name) { super(name); }
}

class Patient extends Person {
    public Patient(String name) { super(name); }
}

public class Q4_Hospital {
    public static void main(String[] args) {
        try {
            Person p1 = new Doctor("Dr. Sita");
            Person p2 = new Patient("Hari");
            System.out.println("Doctor: " + p1.getName());
            System.out.println("Patient: " + p2.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
