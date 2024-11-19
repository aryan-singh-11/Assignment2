class ThisDemo {
    private int number;

    public ThisDemo(int number) {
        this.number = number; // 'this' refers to the instance variable
    }

    public void display() {
        System.out.println("Number: " + this.number);
    }
}

public class q15 {
    public static void main(String[] args) {
        ThisDemo demo = new ThisDemo(10);
        demo.display();
    }
}
