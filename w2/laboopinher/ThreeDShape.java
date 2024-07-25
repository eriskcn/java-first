package w2.laboopinher;

public class ThreeDShape extends Shape {
    public ThreeDShape(String name) {
        super(name);
    }

    public void display() {
        System.out.println("3D Shape: " + this.name);        
    }
}
