public class q19 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
