package Java_Fundamentals.Arrays;

import java.util.Scanner;
public class M3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input array elements from user
        System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the number to search
        System.out.print("Enter the number to search: ");
        int searchElement = scanner.nextInt();

        int index = -1;

        // Search the element in array
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchElement) {
                index = i;
                break;
            }
        }

        // Output result
        if (index == -1) {
            System.out.println("-1");
        } else {
            System.out.println("Element found at index: " + index);
        }

        scanner.close();
    }
}
