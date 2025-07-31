package Java_Fundamentals.Flow_Control_Statements;

import java.util.Scanner;

public class M5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);  // Change this to test with different characters

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9')
        {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
