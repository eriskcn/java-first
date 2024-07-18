import java.util.Scanner;

public class w1lab2b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your number: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an even");
            } else {
                System.out.println(number + " is an odd");
            }
        } finally {
            scanner.close();
        }

    }
}
