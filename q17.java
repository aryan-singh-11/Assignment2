import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numStr = scanner.next();
        int sum = 0;

        for (int i = 0; i < numStr.length() - 1; i++) {
            String part = numStr.substring(i, i + 2);
            sum += Integer.parseInt(part);
        }

        System.out.println("Sum of consecutive digits: " + sum);
    }
}
