package OOPS_or_Inheritance.String_StringBuffer;

import java.util.*;
public class M10
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input n
        System.out.print("Enter an integer n (0 to " + input.length() + "): ");
        int n = scanner.nextInt();

        if (n < 0 || n > input.length()) {
            System.out.println("Invalid value of n.");
        } else {
            String result = repeatLastN(input, n);
            System.out.println("Output: " + result);
        }

        scanner.close();
    }

    public static String repeatLastN(String str, int n) {
        String lastN = str.substring(str.length() - n);
        return lastN.repeat(n);  // Java 11+ supports repeat()
    }
}
