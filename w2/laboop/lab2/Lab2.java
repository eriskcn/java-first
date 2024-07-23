package w2.laboop.lab2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            System.out.println("Enter two numbers:  ");
            double first = scanner.nextInt();
            double second = scanner.nextDouble();
            System.out.println(first + " + " + second + " = " + calc.add(first, second));
            System.out.println(first + " - " + second + " = " + calc.minus(first, second));
            System.out.println(first + " * " + second + " = " + calc.multiply(first, second));
            System.out.println(first + " / " + second + " = " + calc.divide(first, second));
        } finally {
            scanner.close();
        }
    }
}
