// Java code to create linked list with employee objects.
import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;
    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDesignation() {
        return designation;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Sony", "Manager",50000));
        employees.add(new Employee(2, "Smiley", "Developer",65000));
        employees.add(new Employee(3, "Bhanu", "Analyst",70000));
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("Sorted by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        Collections.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println("\nSorted by Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
