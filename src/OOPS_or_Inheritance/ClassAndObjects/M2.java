package OOPS_or_Inheritance.ClassAndObjects;
import java.util.*;
public class M2
{

    // Method 1: powerInt - returns int^int
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Method 2: powerDouble - returns double^int
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    // Main method to test the functionalities
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input for powerInt
        System.out.print("Enter first integer (base): ");
        int baseInt = scanner.nextInt();
        System.out.print("Enter second integer (exponent): ");
        int exponentInt = scanner.nextInt();
        int resultInt = powerInt(baseInt, exponentInt);
        System.out.println(baseInt + " to the power of " + exponentInt + " is (int): " + resultInt);

        System.out.println();

        // Input for powerDouble
        System.out.print("Enter a double value (base): ");
        double baseDouble = scanner.nextDouble();
        System.out.print("Enter an integer exponent: ");
        int exponentDouble = scanner.nextInt();
        double resultDouble = powerDouble(baseDouble, exponentDouble);
        System.out.println(baseDouble + " to the power of " + exponentDouble + " is (double): " + resultDouble);
    }
}

