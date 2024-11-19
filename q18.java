interface A {
    void methodA1();
    void methodA2();
}

interface B {
    void methodB1();
    void methodB2();
}

interface C {
    void methodC1();
    void methodC2();
}

interface D extends A, B, C {
    void methodD();
}

class MyClass extends SomeConcreteClass implements D {
    @Override
    public void methodA1() {
        System.out.println("A1 implemented");
    }

    @Override
    public void methodA2() {
        System.out.println("A2 implemented");
    }

    @Override
    public void methodB1() {
        System.out.println("B1 implemented");
    }

    @Override
    public void methodB2() {
        System.out.println("B2 implemented");
    }

    @Override
    public void methodC1() {
        System.out.println("C1 implemented");
    }

    @Override
    public void methodC2() {
        System.out.println("C2 implemented");
    }

    @Override
    public void methodD() {
        System.out.println("D method implemented");
    }
}

public class q18 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA1();
        obj.methodB1();
        obj.methodC1();
        obj.methodD();
    }
}
