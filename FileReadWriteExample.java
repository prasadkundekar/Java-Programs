import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {

    public static void main(String[] args) {
        String filePath = "my_file.txt";
        writeToFile(filePath, "Hello, Java File I/O!\n");
        writeToFile(filePath, "This is the second line of text.\n");
        writeToFile(filePath, "The quick brown fox jumps over the lazy dog.");
        readFromFile(filePath);
    }

    public static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            System.out.println("Successfully wrote to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void readFromFile(String filePath) {
        System.out.println("\n--- Reading from " + filePath + " ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}