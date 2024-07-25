package w2.laboopinher;

public class Square extends TwoDShape {
    private double side;
    public Square(double side) {
        super("Square");
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
        System.out.println("Square with side: " + this.side);
    }
}
    
