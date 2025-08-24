abstract class Animal {
    private String name;
    public Animal(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Invalid name");
        this.name = name;
    }
    public String getName() { return name; }
    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
    public void makeSound() { System.out.println("Woof!"); }
}

class Cat extends Animal {
    public Cat(String name) { super(name); }
    public void makeSound() { System.out.println("Meow!"); }
}

class Cow extends Animal {
    public Cow(String name) { super(name); }
    public void makeSound() { System.out.println("Moo!"); }
}

public class Q6_Animal {
    public static void main(String[] args) {
        try {
            Animal[] animals = { new Dog("Buddy"), new Cat("Kitty"), new Cow("Bessie") };
            for (Animal a : animals) {
                System.out.print(a.getName() + " says: ");
                a.makeSound();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
