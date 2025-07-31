package IOStreams.Object_Serialization;

import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // toString method for displaying object data
    @Override
    public String toString() {
        return "Name: " + name + "\nDOB: " + dateOfBirth + "\nDepartment: " + department +
                "\nDesignation: " + designation + "\nSalary: " + salary;
    }
}

public class M1
{
    public static void main(String[] args) {
        String filename = "data";

        // Creating an Employee object
        Employee emp = new Employee("Shree Harinesh", new Date(), "IT", "Developer", 75000.0);

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(emp);
            System.out.println("Employee object serialized to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Employee deserializedEmp = (Employee) in.readObject();
            System.out.println("\nDeserialized Employee Object:");
            System.out.println(deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

