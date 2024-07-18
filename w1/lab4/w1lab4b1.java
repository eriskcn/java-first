import java.util.Scanner;

public class w1lab4b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter three real numbers: ");
            double firstNumber = scanner.nextDouble();
            double secondNumber = scanner.nextDouble();
            double thirdNumber = scanner.nextDouble();

            double sum = firstNumber + secondNumber + thirdNumber;

            System.out.println("Sum: " + sum);
        } finally {
            scanner.close();
        }
    }
}
