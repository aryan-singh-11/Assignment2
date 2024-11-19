import java.util.Scanner;

class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter candidate name: ");
        String name = scanner.nextLine();
        System.out.print("Enter candidate age: ");
        int age = scanner.nextInt();

        try {
            if (age > 45) {
                throw new TooOlder("Candidate is too old for recruitment.");
            } else if (age < 20) {
                throw new TooYounger("Candidate is too young for recruitment.");
            } else {
                System.out.println("Candidate is eligible.");
                System.out.println("Name: " + name);
            }
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        }
    }
}
