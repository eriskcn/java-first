package w2.laboop.lab1;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String address;

    Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter information");
            this.name = scanner.nextLine();
            this.address = scanner.nextLine();
            this.age = scanner.nextInt();
        } finally {
            scanner.close();
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age + " years old");
        System.out.println("Address: " + this.address);
    }
}
