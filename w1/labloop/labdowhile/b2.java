package labloop.labdowhile;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x;
            do {
                System.out.println("Enter an integer: ");
                x = scanner.nextInt();
            } while (x != 0);
        } finally {
            scanner.close();
        }
    }
}
