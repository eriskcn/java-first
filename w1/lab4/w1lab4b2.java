import java.util.Scanner;

public class w1lab4b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter two real numbers: ");
            double firstNumber = scanner.nextDouble();
            double secondNumber = scanner.nextDouble();

            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
            if (secondNumber != 0) {
                System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
            } else {
                System.err.println("Error: Division by zero");
            }
        } finally {
            scanner.close();
        }
    }
}
