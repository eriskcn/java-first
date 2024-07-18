import java.util.Scanner;

public class w1lab1b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int square = number * number;
            System.out.println("Square: " + square);
            int cube = square * number;
            System.out.println("Cube: " + cube);
        } finally {
            scanner.close();
        }
    }
}
