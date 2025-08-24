class Transport {
    private double distance;
    public Transport(double distance) {
        if (distance <= 0) throw new IllegalArgumentException("Invalid distance");
        this.distance = distance;
    }
    public double getDistance() { return distance; }
    public double calculateFare() { return 0; }
}

class Bus extends Transport {
    public Bus(double d) { super(d); }
    public double calculateFare() { return getDistance() * 2; }
}

class Train extends Transport {
    public Train(double d) { super(d); }
    public double calculateFare() { return getDistance() * 1.5; }
}

class Taxi extends Transport {
    public Taxi(double d) { super(d); }
    public double calculateFare() { return getDistance() * 5; }
}

public class Q17_TransportFare {
    public static void main(String[] args) {
        try {
            Transport t1 = new Bus(10);
            Transport t2 = new Train(15);
            Transport t3 = new Taxi(8);
            System.out.println("Bus Fare: " + t1.calculateFare());
            System.out.println("Train Fare: " + t2.calculateFare());
            System.out.println("Taxi Fare: " + t3.calculateFare());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
