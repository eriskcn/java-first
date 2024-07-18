import java.util.Scanner;

public class w1lab1b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter three numbers:");
            double firstNumber = scanner.nextDouble();
            double secondNumber = scanner.nextDouble();
            double thirdNumber = scanner.nextDouble();

            double sum = firstNumber + secondNumber + thirdNumber;
            double average = sum / 3;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } finally {
            scanner.close();
        }
    }
}
