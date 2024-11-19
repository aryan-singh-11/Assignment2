class Vehicle {
    protected String regnNumber, color, ownerName;
    protected int speed;

    public Vehicle(String regnNumber, String color, int speed, String ownerName) {
        this.regnNumber = regnNumber;
        this.color = color;
        this.speed = speed;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    public Bus(String regnNumber, String color, int speed, String ownerName, int routeNumber) {
        super(regnNumber, color, speed, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Bus Details:");
        System.out.println("RegnNumber: " + regnNumber + ", Color: " + color + ", Speed: " + speed + ", Owner: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, String color, int speed, String ownerName, String manufacturerName) {
        super(regnNumber, color, speed, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Car Details:");
        System.out.println("RegnNumber: " + regnNumber + ", Color: " + color + ", Speed: " + speed + ", Owner: " + ownerName);
        System.out.println("Manufacturer: " + manufacturerName);
    }
}

public class q10 {
    public static void main(String[] args) {
        Bus bus = new Bus("B123", "Blue", 60, "John Doe", 45);
        Car car = new Car("C789", "Red", 120, "Jane Doe", "Toyota");

        bus.showData();
        System.out.println();
        car.showData();
    }
}
