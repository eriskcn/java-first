package w2.labiobasic;

import java.io.File;
import java.io.IOException;
public class iobasic {
    public static void main(String[] args) {
        String directoryName = "Business";
        String fileName = "demo.txt";

        // Create the directory
        File directory = new File(directoryName);
        if (directory.mkdir()) {
            System.out.println("Directory created successfully: " + directoryName);
        } else {
            System.out.println("Failed to create directory: " + directoryName);
        }

        // Create the file inside the directory
        File file = new File(directory, fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getPath());
            } else {
                System.out.println("File already exists: " + file.getPath());
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
