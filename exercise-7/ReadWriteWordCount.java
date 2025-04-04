import java.io.*;

public class ReadWriteWordCount {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("input.txt");
             BufferedReader reader = new BufferedReader(file);
             FileWriter fileWriter = new FileWriter("output.txt");
             BufferedWriter writer = new BufferedWriter(fileWriter)) {

            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line);
                writer.newLine();
                wordCount += line.split("\\s+").length; // Count words
            }

            System.out.println("Total Words: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
