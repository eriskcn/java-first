package w2.laboopinher;

public class Tetrahedron extends ThreeDShape {
    double edge;

    public Tetrahedron(double edge) {
        super("Tetrahedron");
        this.edge = edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return this.edge;
    }

    public void display() {
        super.display();
        System.out.println("Tetrahedron with edge: " + this.edge);
    }
}
