import java.util.*;
class Person{
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person{
    public String designation;
    public int salary;

    public Employee(String name, String designation, int age, int salary){
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public void display(Employee[] arr){
        for (Employee e:arr){
            if (e.salary > 5000)
            {
                System.out.println(e.name);
            }
        }
    }
}

public class Salary {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Employee[] employees = new Employee[5];

    // Accept data for 5 persons
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Designation: ");
            String designation = scanner.nextLine();

            System.out.print("Salary: ");
            int salary = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            employees[i] = new Employee(name, designation, age, salary);
        }

        employees[0].display(employees);
    }
}

