package Abstraction_or_Packages_or_ExceptionHandling.Exception_Handling;

import java.util.Scanner;

// Custom Exception for negative values
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

// Custom Exception for out-of-range values (>100)
class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class M3
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int STUDENTS = 2;
        final int SUBJECTS = 3;

        for (int i = 1; i <= STUDENTS; i++) {
            System.out.println("Enter the name of student " + i + ":");
            String name = sc.nextLine();

            int[] marks = new int[SUBJECTS];
            int sum = 0;

            try {
                for (int j = 0; j < SUBJECTS; j++) {
                    System.out.println("Enter mark " + (j + 1) + " for " + name + ":");
                    String input = sc.nextLine();

                    int mark = Integer.parseInt(input);

                    if (mark < 0) {
                        throw new NegativeValueException("Negative marks are not allowed.");
                    } else if (mark > 100) {
                        throw new OutOfRangeException("Marks greater than 100 are not allowed.");
                    }

                    marks[j] = mark;
                    sum += mark;
                }

                double average = sum / 3.0;
                System.out.println("Average marks for " + name + ": " + average);

            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Please enter only integer marks.");
            } catch (NegativeValueException | OutOfRangeException e) {
                System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            }

            System.out.println(); // Just for separation between students
        }

        sc.close();
    }
}

