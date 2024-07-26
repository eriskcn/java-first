package w2.labreadwritefile;

import java.io.*;
import java.util.*;

public class ReadWriteFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        try {

            // Enter strings
            System.out.println("Enter 5 strings:");
            for (int i = 0; i < 5; i++) {
                lines.add(scanner.nextLine());
            }

            // Write strings to file
            String filePath = "E/Tony.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Read file
            List<String> fileLines = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    fileLines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Print file contents
            System.out.println("Contents of file Tony.txt:");
            for (String line : fileLines) {
                System.out.println(line);
            }

            // Print file contents in reverse order
            System.out.println("Contents in reverse order:");
            Collections.reverse(fileLines);
            for (String line : fileLines) {
                System.out.println(line);
            }

        } finally {
            scanner.close();
        }
    }
}
