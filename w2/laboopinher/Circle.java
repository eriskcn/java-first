package w2.laboopinher;

public class Circle extends TwoDShape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void display() {
        super.display();
        System.out.println("Circle with radius: " + this.radius);
    }
}
