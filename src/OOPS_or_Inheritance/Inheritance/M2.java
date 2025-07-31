package OOPS_or_Inheritance.Inheritance;

import java.util.Scanner;

// Person class
class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

// Employee class inheriting Person
class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Setters
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // toString method
    public String toString() {
        return "Name: " + getName() +
                "\nAnnual Salary: ₹" + annualSalary +
                "\nYear Started: " + yearStarted +
                "\nNational Insurance Number: " + nationalInsuranceNumber;
    }
}

// Main testing class
public class M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter annual salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter year started: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Clear newline

        System.out.print("Enter national insurance number: ");
        String insurance = scanner.nextLine();

        // Create and print
        Employee emp = new Employee(name, salary, year, insurance);
        System.out.println("\n--- Employee Details ---");
        System.out.println(emp.toString());

        scanner.close();
    }
}

