import java.util.Scanner;

class Employee {
    private int emp_id;
    private String emp_name;
    private double basic_salary;

    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }

    public void displayGrossSalary() {
        double da = 0.1 * basic_salary; // DA = 10% of basic salary
        double hra = 0.05 * basic_salary; // HRA = 5% of basic salary
        double gross_salary = basic_salary + da + hra;
        System.out.println("Gross Salary of " + emp_name + " is: " + gross_salary);
    }
}

public class q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.next();
        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble();

        Employee emp = new Employee(emp_id, emp_name, basic_salary);
        emp.displayGrossSalary();
    }
}
