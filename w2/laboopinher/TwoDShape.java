package w2.laboopinher;

public class TwoDShape extends Shape {
    public TwoDShape(String name) {
        super(name);
    }

    public void display() {
        System.out.println("2D Shape: " + this.name);        
    }
}
