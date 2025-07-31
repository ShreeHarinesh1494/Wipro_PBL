package OOPS_or_Inheritance.String_StringBuffer;

import java.util.*;
public class M6
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = scanner.nextLine();

        System.out.print("Enter second string: ");
        String b = scanner.nextLine();

        String result = combineShortLongShort(a, b);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String combineShortLongShort(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}
