abstract class Appliance {
    public abstract void turnOn();
    public abstract void turnOff();
}

class Fan extends Appliance {
    public void turnOn() { System.out.println("Fan is ON"); }
    public void turnOff() { System.out.println("Fan is OFF"); }
}

class Light extends Appliance {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}

class AC extends Appliance {
    public void turnOn() { System.out.println("AC is ON"); }
    public void turnOff() { System.out.println("AC is OFF"); }
}

public class Q9_ApplianceSystem {
    public static void main(String[] args) {
        Appliance[] apps = { new Fan(), new Light(), new AC() };
        for (Appliance a : apps) {
            a.turnOn();
            a.turnOff();
        }
    }
}
