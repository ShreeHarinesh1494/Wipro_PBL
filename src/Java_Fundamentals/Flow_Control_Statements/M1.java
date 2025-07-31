package Java_Fundamentals.Flow_Control_Statements;
import java.util.Scanner;
public class M1
{
    public static void checkSign(int num)
    {
        if (num > 0)
        {
            System.out.println(num + " is Positive.");
        }
        else if (num < 0)
        {
            System.out.println(num + " is Negative.");
        }
        else
        {
            System.out.println("The number is Zero.");
        }
    }

    public static boolean lastDigit(int a, int b)
    {
        return (a % 10) == (b % 10);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // --- Part A ---
        System.out.print("Enter an integer to check if it is positive, negative, or zero: ");
        int number = scanner.nextInt();
        checkSign(number);

        // --- Part B ---
        System.out.print("Enter first non-negative integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second non-negative integer: ");
        int num2 = scanner.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Error: Both numbers should be non-negative.");
        } else {
            boolean result = lastDigit(num1, num2);
            System.out.println("Do " + num1 + " and " + num2 + " have the same last digit? " + result);
        }

        scanner.close();
    }
}
