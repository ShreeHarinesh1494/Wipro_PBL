package OOPS_or_Inheritance.String_StringBuffer;
import java.util.*;
public class M4
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = getFirstHalfIfEven(input);

        if (result != null) {
            System.out.println("First half: " + result);
        } else {
            System.out.println("Output: null");
        }

        scanner.close();
    }

    public static String getFirstHalfIfEven(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        } else {
            return null;
        }
    }
}
