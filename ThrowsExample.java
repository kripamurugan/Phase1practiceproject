package corejavapracticeproject;
import java.io.IOException;
public class ThrowsExample {
    public void readFile(String fileName) throws IOException {
        if (!fileExists(fileName)) {
            throw new IOException("File not found: " + fileName);
        }

        System.out.println("Reading file: " + fileName);
    }

    public boolean fileExists(String fileName) {
        return fileName.equals("example.txt");
    }

    public static void main(String[] args) {
        ThrowsExample example = new ThrowsExample();
        String fileName = "non_existent_file.txt";

        try {
            example.readFile(fileName);
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }
}
