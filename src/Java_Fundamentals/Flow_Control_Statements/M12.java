package Java_Fundamentals.Flow_Control_Statements;
import java.util.Scanner;
public class M12
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        if (number <= 1)
        {
            System.out.println(number + " is not a prime number.");
        }
        else
        {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                System.out.println(number + " is a prime number.");
            }
            else
            {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }
}
