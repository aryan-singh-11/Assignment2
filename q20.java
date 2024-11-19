public class q20 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[-1] = 10; // Negative index
            int result = 10 / 0; // Division by zero
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught Negative Array Index Exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: " + e);
        }
    }
}
