class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class q23 {
    public static void main(String[] args) {
        int temp = 38; // You can take input using Scanner

        try {
            if (temp > 35) {
                throw new TooHot("Temperature is too hot!");
            } else if (temp < 5) {
                throw new TooCold("Temperature is too cold!");
            } else {
                System.out.println("Temperature is normal.");
                double fahrenheit = (temp * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }
        } catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        }
    }
}
