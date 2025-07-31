package OOPS_or_Inheritance.OptionalClass;

import java.util.Optional;

// Custom Exception Class
class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

// Employee Class
class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// Main Class
public class M3 {
    public static void main(String[] args) {
        try {
            // You can change this to null to test the exception
            Employee emp = null;  // or: new Employee("John", 101);

            // Wrap the employee in an Optional
            Optional<Employee> optionalEmp = Optional.ofNullable(emp);

            // Use orElseThrow to throw a custom exception if null
            Employee validEmp = optionalEmp.orElseThrow(() ->
                    new InvalidEmployeeException("Invalid Employee: Employee object is null")
            );

            // If not null, display employee info
            validEmp.display();

        } catch (InvalidEmployeeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}

