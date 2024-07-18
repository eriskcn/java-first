import java.util.Scanner;

public class w1lab3b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter radius: ");
            float radius = scanner.nextFloat();
            float perimeter = (float) Math.PI * 2 * radius;
            float area = (float) Math.PI * radius * radius;

            System.out.println("Perimeter: " + perimeter);
            System.out.println("Area: " + area);
        } finally {
            scanner.close();
        }
    }
}
