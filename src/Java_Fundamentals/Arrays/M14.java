package Java_Fundamentals.Arrays;
import java.util.*;
public class M14
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int max = Integer.MIN_VALUE;

        System.out.println("Enter 9 integers to fill the 3x3 array:");

        // Input and find max
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        // Print the matrix
        System.out.println("The given array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the max number
        System.out.println("The biggest number in the given array is");
        System.out.println(max);

        scanner.close();
    }
}
