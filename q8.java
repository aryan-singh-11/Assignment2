class Parent {
    public static void display() {
        System.out.println("This is the parent class (static method).");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("This is the child class (static method).");
    }
}

public class q8 {
    public static void main(String[] args) {
        Parent.display();
        Child.display();
    }
}
