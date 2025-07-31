package Java_Fundamentals.Arrays;

import java.util.*;
public class M10
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integer elements:");

        // Input array elements
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create new array to hold rearranged elements
        int[] result = new int[size];
        int index = 0;

        // First add even numbers
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        // Then add odd numbers
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        // Print result
        System.out.print("Rearranged array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");

        scanner.close();
    }
}
