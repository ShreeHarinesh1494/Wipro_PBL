package Wrapper_Class;

import java.util.Scanner;

public class M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (1 to 255): ");
        try {
            int number = scanner.nextInt();

            if (number < 1 || number > 255) {
                System.out.println("Error: Please enter a number between 1 and 255.");
                return;
            }

            String binaryString = Integer.toBinaryString(number);
            String paddedBinary = String.format("%8s", binaryString).replace(' ', '0');

            System.out.println("Binary representation (8-bit): " + paddedBinary);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

