class StaticDemo {
    private static int count = 0;

    public StaticDemo() {
        count++;
    }

    public static void showCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class q16 {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();
        
        StaticDemo.showCount(); // static method called without object
    }
}
