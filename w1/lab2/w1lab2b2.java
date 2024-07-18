import java.util.Scanner;

public class w1lab2b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter three numbers: ");
            float first = scanner.nextFloat();
            float second = scanner.nextFloat();
            float third = scanner.nextFloat();

            float max = first;
            if (second > max) {
                max = second;
            }
            if (third > max) {
                max = third;
            }

            System.out.println("Max: " + max);
        } finally {
            scanner.close();
        }
    }
}
