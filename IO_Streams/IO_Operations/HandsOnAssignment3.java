import java.io.*;
import java.util.*;

class HandsOnAssignment3 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java HandsOnAssignment3 <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        TreeMap<String, Integer> wordCount = new TreeMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));

            String line;
            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }

            bw.close();

            System.out.println("Word count has been written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}