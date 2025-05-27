import java.util.Scanner;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge(int birthYear) {
        int currentYear = 2025;
        int age = currentYear - birthYear;
        System.out.println("Age: " + age + " years");
    }
}

class Employee extends Person {
    int empId;
    double salary;

    public Employee(String name, int empId, double salary) {
        super(name);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayName();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: ₹" + salary);
    }
}

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter year of birth: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter employee ID: ");
        int empId = sc.nextInt();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(name, empId, salary);
        emp.displayEmployeeDetails();
        emp.displayAge(birthYear);

        sc.close();
    }
}
