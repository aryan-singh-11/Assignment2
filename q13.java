
class GrandParent {
    public void show() {
        System.out.println("This is the Grandparent class.");
    }
}

class Parent extends GrandParent {
    @Override
    public void show() {
        super.show();
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        super.show();
        System.out.println("This is the Child class.");
    }
}

public class q13 {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

