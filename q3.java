class ExampleParameterizedConstructor {
    int number;

    public ExampleParameterizedConstructor(int number) {
        this.number = number;
        System.out.println("Parameterized constructor called with value: " + number);
    }
}

public class q3 {
    public static void main(String[] args) {
        ExampleParameterizedConstructor obj = new ExampleParameterizedConstructor(10);
    }
}
