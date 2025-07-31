package Java_Fundamentals.Flow_Control_Statements;
import java.util.*;
public class M16
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number of " + originalNumber + " is: " + reversed);

        scanner.close();
    }
}
