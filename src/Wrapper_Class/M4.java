package Wrapper_Class;

class Employee implements Cloneable {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setDepartment(String department) { this.department = department; }

    // toString method for printing
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }

    // Clone method
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
            return null;
        }
    }

    public static void main(String[] args) {
        // Original object
        Employee emp1 = new Employee("Alice", 30, "IT");

        // Clone object
        Employee emp2 = emp1.clone();

        // Modify original object
        emp1.setName("Bob");
        emp1.setAge(35);
        emp1.setDepartment("HR");

        // Print both objects
        System.out.println("Original Employee: " + emp1);
        System.out.println("Cloned Employee:   " + emp2);
    }
}

