package Java_Fundamentals.Arrays;
import java.util.*;
public class M7
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integer elements:");

        // Input array elements
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Use LinkedHashSet to remove duplicates and preserve order
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Print result
        System.out.print("Array after removing duplicates: {");
        int count = 0;
        for (int num : uniqueElements) {
            System.out.print(num);
            if (++count < uniqueElements.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        scanner.close();
    }
}
