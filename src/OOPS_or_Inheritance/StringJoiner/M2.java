package OOPS_or_Inheritance.StringJoiner;

import java.util.*;
public class M2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of cities for s1
        System.out.print("Enter number of cities for s1: ");
        int n1 = scanner.nextInt();
        scanner.nextLine(); // consume newline

        StringJoiner s1 = new StringJoiner("-");
        System.out.println("Enter " + n1 + " cities for s1:");
        for (int i = 0; i < n1; i++) {
            System.out.print("City " + (i + 1) + ": ");
            s1.add(scanner.nextLine());
        }

        // Read number of cities for s2
        System.out.print("Enter number of cities for s2: ");
        int n2 = scanner.nextInt();
        scanner.nextLine(); // consume newline

        StringJoiner s2 = new StringJoiner("-");
        System.out.println("Enter " + n2 + " cities for s2:");
        for (int i = 0; i < n2; i++) {
            System.out.print("City " + (i + 1) + ": ");
            s2.add(scanner.nextLine());
        }

        // i) s1 merged to s2
        StringJoiner merged1 = new StringJoiner("-");
        merged1.add(s1.toString()).add(s2.toString());
        System.out.println("\n(i) s1 merged to s2: " + merged1);

        // ii) s2 merged to s1
        StringJoiner merged2 = new StringJoiner("-");
        merged2.add(s2.toString()).add(s1.toString());
        System.out.println("(ii) s2 merged to s1: " + merged2);

        scanner.close();
    }
}
