package Wrapper_Class;

import java.util.Scanner;

public class M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get number from user input
            System.out.print("Enter an integer: ");
            int number = Integer.parseInt(scanner.nextLine());

            // Display equivalents
            System.out.println("Given Number: " + number);
            System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
            System.out.println("Octal equivalent: " + Integer.toOctalString(number));
            System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number).toUpperCase());

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

