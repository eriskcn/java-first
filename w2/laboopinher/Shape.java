package w2.laboopinher;

public class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Shape: " + this.name);
    }
}
