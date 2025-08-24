abstract class Vehicle {
    private String name;
    private int speed;

    public Vehicle(String name, int speed) {
        if (speed < 0) throw new IllegalArgumentException("Invalid speed");
        this.name = name;
        this.speed = speed;
    }

    public String getName() { return name; }
    public int getSpeed() { return speed; }
}

class Car extends Vehicle {
    public Car(String name, int speed) { super(name, speed); }
}

class Bike extends Vehicle {
    public Bike(String name, int speed) { super(name, speed); }
}

public class Q2_Vehicle {
    public static void main(String[] args) {
        try {
            Vehicle v1 = new Car("Toyota", 120);
            Vehicle v2 = new Bike("Honda", 80);
            System.out.println(v1.getName() + " Speed: " + v1.getSpeed());
            System.out.println(v2.getName() + " Speed: " + v2.getSpeed());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
