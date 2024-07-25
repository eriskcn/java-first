package w2.laboopinher;

public class testShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 4);
        Sphere sphere = new Sphere(2);
        Tetrahedron tetrahedron = new Tetrahedron(5);
        Cube cube = new Cube(3);
        circle.display();
        square.display();
        triangle.display();
        sphere.display();
        tetrahedron.display();
        cube.display();
    }
}
