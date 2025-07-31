package Abstraction_or_Packages_or_ExceptionHandling.Exception_Handling;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class M5 {
    public static void main(String[] args) {
        try {
            // Check if both arguments are provided
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide both name and age as arguments.");
            }

            String name = args[0];
            int age;

            // Parse age
            try {
                age = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Age must be a valid integer.");
            }

            // Validate age
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be between 18 and 59.");
            }

            // If all is good
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

