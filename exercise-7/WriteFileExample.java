import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("myfile.txt", true); // Append mode
            BufferedWriter writer = new BufferedWriter(file);
            writer.write("This is a new line.");
            writer.newLine();
            writer.write("Appending more data.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }
    }
}
