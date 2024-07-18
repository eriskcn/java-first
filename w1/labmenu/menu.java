package labmenu;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            boolean end = false;
            while (!end) {
                System.out.println("_____________MENU_____________");
                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Triangle");
                System.out.println("4. Square");
                System.out.println("5. Weighing Trapezoids");
                System.out.println("6. Exit");
                System.out.println("______________________________");

                int choice;
                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();
                System.out.println("_____________________________");
                switch (choice) {
                    case 1:
                        System.out.println("Calculate area and perimeter of circle");
                        System.out.println("Enter radius: ");
                        double radius = scanner.nextDouble();
                        Circle circle = new Circle(radius);
                        System.out.println("Area: " + circle.calculateArea());
                        System.out.println("Perimeter: " + circle.calculatePerimeter());
                        System.out.println("_____________________________");

                        break;
                    case 2:
                        System.out.println("Calculate area and perimeter of rectangle");
                        System.out.println("Enter height: ");
                        double height = scanner.nextDouble();
                        System.out.println("Enter width: ");
                        double width = scanner.nextDouble();
                        Rectangle rectangle = new Rectangle(height, width);
                        System.out.println("Area: " + rectangle.calculateArea());
                        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
                        System.out.println("_____________________________");

                        break;
                    case 3:
                        System.out.println("Calculate area and perimeter of triangle");
                        System.out.println("Enter three edges: ");
                        double edge1 = scanner.nextDouble();
                        double edge2 = scanner.nextDouble();
                        double edge3 = scanner.nextDouble();

                        Triangle triangle = new Triangle(edge1, edge2, edge3);
                        System.out.println("Area: " + triangle.calculateArea());
                        System.out.println("Perimeter: " + triangle.calculatePerimeter());
                        System.out.println("_____________________________");

                        break;
                    case 4:
                        System.out.println("Calculate area and perimeter of square");
                        System.out.println("Enter edge: ");
                        double edge = scanner.nextDouble();

                        Square square = new Square(edge);
                        System.out.println("Area: " + square.calculateArea());
                        System.out.println("Perimeter: " + square.calculatePerimeter());
                        System.out.println("_____________________________");

                        break;
                    case 5:
                        System.out.println("Calculate area and perimeter of weighing trapezoid");
                        System.out.println("Enter height: ");
                        double anotherHeight = scanner.nextDouble();
                        double smallWidth = scanner.nextDouble();
                        double bigWidth = scanner.nextDouble();

                        WeighingTrapezoid weighingTrapezoid = new WeighingTrapezoid(anotherHeight, smallWidth,
                                bigWidth);
                        System.out.println("Area: " + weighingTrapezoid.calculateArea());
                        System.out.println("Perimeter: " + weighingTrapezoid.calculatePerimeter());
                        System.out.println("_____________________________");

                        break;
                    case 6:
                        end = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Try again!");
                        System.out.println("_____________________________");

                        break;
                }
            }
        } finally {
            scanner.close();
        }
    }
}
