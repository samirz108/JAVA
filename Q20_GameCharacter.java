abstract class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        if (health <= 0) throw new IllegalArgumentException("Invalid health");
        this.name = name;
        this.health = health;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public abstract void attack();
}

class Warrior extends Character {
    public Warrior(String name, int health) { super(name, health); }
    public void attack() { System.out.println(getName() + " attacks with sword!"); }
}

class Mage extends Character {
    public Mage(String name, int health) { super(name, health); }
    public void attack() { System.out.println(getName() + " casts a spell!"); }
}

class Archer extends Character {
    public Archer(String name, int health) { super(name, health); }
    public void attack() { System.out.println(getName() + " shoots an arrow!"); }
}

public class Q20_GameCharacter {
    public static void main(String[] args) {
        try {
            Character c1 = new Warrior("Arjun", 100);
            Character c2 = new Mage("Gandalf", 80);
            Character c3 = new Archer("Robin", 90);
            c1.attack();
            c2.attack();
            c3.attack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
