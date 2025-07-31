package Abstraction_or_Packages_or_ExceptionHandling.Exception_Handling;

import java.util.Scanner;

public class M1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input number of elements
            System.out.println("Enter the number of elements in the array");
            int n = Integer.parseInt(sc.nextLine());

            int[] arr = new int[n];

            // Input elements
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(sc.nextLine());
            }

            // Input index to access
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(sc.nextLine());

            // Access and print the element
            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }

        sc.close();
    }
}

