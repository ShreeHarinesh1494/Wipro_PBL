package Java_Fundamentals.Arrays;

import java.util.Scanner;

public class M2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for(int i=0;i<n;i++)
        {
            numbers[i] = sc.nextInt();
        }
        // Assume first element is both min and max
        int max = numbers[0];
        int min = numbers[0];

        // Traverse the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}
