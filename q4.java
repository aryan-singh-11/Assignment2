class ConstructorOverload {
    int number;
    String name;

    public ConstructorOverload() {
        this.number = 0;
        this.name = "Unknown";
        System.out.println("Default constructor called.");
    }

    public ConstructorOverload(int number) {
        this.number = number;
        this.name = "Unknown";
        System.out.println("Constructor with number called.");
    }

    public ConstructorOverload(String name) {
        this.number = 0;
        this.name = name;
        System.out.println("Constructor with name called.");
    }

    public void display() {
        System.out.println("Number: " + number + ", Name: " + name);
    }
}

public class q4 {
    public static void main(String[] args) {
        ConstructorOverload obj1 = new ConstructorOverload();
        ConstructorOverload obj2 = new ConstructorOverload(10);
        ConstructorOverload obj3 = new ConstructorOverload("Alice");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
