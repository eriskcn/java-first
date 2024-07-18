import java.util.Scanner;

public class w1lab4b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a char: ");
            char character = scanner.next().charAt(0);
            boolean isA = character == 'a' || character == 'A';
            if (isA) {
                System.out.println("The character is 'a'.");
            } else {
                System.out.println("The character is not 'a'.");
            }
        } finally {
            scanner.close();
        }
    }
}
