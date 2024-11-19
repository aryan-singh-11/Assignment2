class Parent {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("This is the child class.");
    }
}

public class q7 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
