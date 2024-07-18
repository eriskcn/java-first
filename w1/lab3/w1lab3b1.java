import java.util.Scanner;

public class w1lab3b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter height and width: ");
            float height = scanner.nextFloat();
            float width = scanner.nextFloat();

            float perimeter = 2 * (height + width);
            float area = height * width;

            System.out.println("Perimeter: " + perimeter);
            System.out.println("Area: " + area);
        } finally {
            scanner.close();
        }
    }
}
