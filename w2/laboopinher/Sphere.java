package w2.laboopinher;

public class Sphere extends ThreeDShape {
    double radius;

    public Sphere(double radius) {
        super("Sphere");
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
        System.out.println("Sphere with radius: " + this.radius);
    }
}
