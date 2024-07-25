package w2.laboopinher;

public class Triangle extends TwoDShape {
    double base;
    double height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return this.base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void display() {
        super.display();
        System.out.println("Triangle with base: " + this.base + " and height: " + this.height);
    }
}
