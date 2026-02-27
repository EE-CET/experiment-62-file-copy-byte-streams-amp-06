import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        // Part 1: Copy from source.txt to destination.txt
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int byteData;

            // Read each byte and write to destination
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
            return; // Stop execution if copy fails
        }

        System.out.println("File Copied");

        // Part 2: Read and display contents of destination.txt
        try (FileInputStream fis = new FileInputStream(destFile)) {

            int byteData;

            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }

        } catch (IOException e) {
            System.out.println("Error reading destination file: " + e.getMessage());
        }
    }
}
