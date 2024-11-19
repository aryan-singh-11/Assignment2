import java.util.HashMap;
import java.util.Scanner;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class q21 {
    public static void main(String[] args) {
        HashMap<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("Germany", "Berlin");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country name: ");
        String country = scanner.nextLine();

        try {
            if (countryCapitalMap.containsKey(country)) {
                System.out.println("The capital of " + country + " is " + countryCapitalMap.get(country));
            } else {
                throw new NoMatchFoundException("No capital found for the country: " + country);
            }
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
