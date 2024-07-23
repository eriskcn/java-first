package w2.laboop.labconstructor;

public class Car {
    private double price;
    private String color;
    private String type;

    Car() {
        this.price = 0.0;
        this.color = "";
        this.type = "";
    }

    Car(double price, String color, String type) {
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public void displayDetails() {
        System.out.println("Car's details");
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
    }
}
