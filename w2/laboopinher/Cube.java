package w2.laboopinher;

public class Cube extends ThreeDShape {
    double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void display() {
        super.display();
        System.out.println("Cube with side: " + this.side);
    }
}
