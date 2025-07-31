package IOStreams.IO_Operation;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get file name
        System.out.println("Enter the file name:");
        String fileName = input.nextLine();

        // Get character to count
        System.out.println("Enter the character to be counted:");
        char targetChar = input.nextLine().toLowerCase().charAt(0);  // Convert to lowercase for case-insensitive check

        int count = 0;

        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine().toLowerCase(); // Convert to lowercase
                for (char ch : line.toCharArray()) {
                    if (ch == targetChar) {
                        count++;
                    }
                }
            }

            fileReader.close();

            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + targetChar + "'.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        input.close();
    }
}

