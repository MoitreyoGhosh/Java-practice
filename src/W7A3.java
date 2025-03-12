import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getDetails(){
        return "Employee: " + name + ", Salary: " + salary;
    }
}

public class W7A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String empName = scanner.next();
        double empSalary = scanner.nextDouble();

        Employee emp = new Employee(empName, empSalary);
        System.out.print(emp.getDetails());

        scanner.close();
    }
}

