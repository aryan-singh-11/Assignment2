import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            }
            System.out.println("Name: " + name + ", Age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
