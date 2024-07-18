import java.util.Scanner;

public class w1lab3b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter three edges: ");
            float firstEdge = scanner.nextFloat();
            float secondEdge = scanner.nextFloat();
            float thirdEdge = scanner.nextFloat();

            float perimeter = firstEdge + secondEdge + thirdEdge;
            System.out.println("Perimeter" + perimeter);

            System.out.println("Enter height: ");
            float height = scanner.nextFloat();
            System.out.println("Enter width: ");
            float width = scanner.nextFloat();

            float area = (height * width) / 2;
            System.out.println("Area: " + area);
        } finally {
            scanner.close();
        }
    }
}
