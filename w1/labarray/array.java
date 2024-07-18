package labarray;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] array = new int[10];
            System.out.println("Enter 10 elements: ");
            for (int i = 0; i < 10; i++) {
                array[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int element : array) {
                sum += element;
            }
            System.out.println("Sum of all elements in array: " + sum);

            int sum3 = 0;
            for (int element : array) {
                if (element % 3 == 0) {
                    sum3 += element;
                }
            }
            System.out.println("Sum of all elements in array that are divisible by 3: " + sum3);

            int countEven = 0;
            for (int element : array) {
                if (element % 2 == 0) {
                    countEven++;
                }
            }
            System.out.println("There are " + countEven + " even elements in the array");
        } finally {
            scanner.close();
        }
    }
}
