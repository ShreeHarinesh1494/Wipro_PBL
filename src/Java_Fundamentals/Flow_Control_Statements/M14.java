package Java_Fundamentals.Flow_Control_Statements;
import java.util.*;
public class M14
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);

        scanner.close();
    }
}
