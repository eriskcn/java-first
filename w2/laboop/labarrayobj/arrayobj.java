package w2.laboop.labarrayobj;

import java.util.Scanner;

public class arrayobj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            SinhVien[] students = new SinhVien[5];
            for (int i = 0; i < 5; i++) {
                students[i] = new SinhVien(); // Initialize each element of the array
                System.out.println("Enter student's information for student " + (i + 1));
                String id = scanner.nextLine();
                String name = scanner.nextLine();
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                students[i].setId(id);
                students[i].setName(name);
                students[i].setAge(age);
            }
        } finally {
            scanner.close();
        }
    }
}
