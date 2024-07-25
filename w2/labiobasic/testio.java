package w2.labiobasic;

import java.io.FileWriter;
import java.io.IOException;
public class testio {
    public static void main(String[] args) {
        String directoryName = "Business";
        String fileName = "demo.txt";
        String content = "Hello, World!";

        try (FileWriter fileWriter = new FileWriter(directoryName + "/" + fileName, true)) {
            fileWriter.write(content);
            System.out.println("Content written to file successfully: " + fileName);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
