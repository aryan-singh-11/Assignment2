class Animal {
    public void sound() {
        System.out.println("This is an animal sound.");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class q5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
