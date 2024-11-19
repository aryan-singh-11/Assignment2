class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class q22
 {
    public static double solveEquation(double a, double b) throws CustomArithmeticException {
        if (b == 0) {
            throw new CustomArithmeticException("Division by zero not allowed!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            double result = solveEquation(10, 0);
            System.out.println("Result: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
