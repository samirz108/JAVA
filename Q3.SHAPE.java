abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Invalid radius");
        this.radius = radius;
    }
    public double calculateArea() { return Math.PI * radius * radius; }
}

class Rectangle extends Shape {
    private double length, width;
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) throw new IllegalArgumentException("Invalid dimension");
        this.length = length; this.width = width;
    }
    public double calculateArea() { return length * width; }
}

public class Q3_Shape {
    public static void main(String[] args) {
        try {
            Shape s1 = new Circle(5);
            Shape s2 = new Rectangle(4, 6);
            System.out.println("Circle Area: " + s1.calculateArea());
            System.out.println("Rectangle Area: " + s2.calculateArea());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
