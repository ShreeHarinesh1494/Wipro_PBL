package OOPS_or_Inheritance.String_StringBuffer;
import java.util.*;
public class M7
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeXAtEnds(input);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String removeXAtEnds(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        if (str.startsWith("x")) {
            str = str.substring(1);
        }

        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
