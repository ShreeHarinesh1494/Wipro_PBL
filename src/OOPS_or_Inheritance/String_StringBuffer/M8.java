package OOPS_or_Inheritance.String_StringBuffer;
import java.util.*;
public class M8
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with * in it: ");
        String input = scanner.nextLine();
        String result = removeStars(input);
        System.out.println("Output: " + result);
        scanner.close();
    }

    public static String removeStars(String str) {
        StringBuilder result = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            // Skip if current is '*' or left/right to '*'
            if (str.charAt(i) == '*') {
                continue;
            } else if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            } else if (i < len - 1 && str.charAt(i + 1) == '*') {
                continue;
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
