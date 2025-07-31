package IOStreams;

import java.io.*;
import java.util.*;

public class M3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount <inputFile> <outputFile>");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = args[1];

        Map<String, Integer> wordCountMap = new TreeMap<>(); // TreeMap to keep words sorted

        try {
            Scanner fileReader = new Scanner(new File(inputFileName));

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] words = line.split("\\s+"); // split by whitespace

                for (String word : words) {
                    // Optional: word = word.toLowerCase(); // Uncomment for case-insensitive counting
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }

            fileReader.close();

            PrintWriter writer = new PrintWriter(outputFileName);
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }

            writer.close();
            System.out.println("Word counts written to " + outputFileName);
        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}

