package labmenu;

public interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double calculatePerimeter() {
        return Math.PI * 2 * this.radius;
    }
}

class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return this.height * this.width;
    }
    public double calculatePerimeter() {
        return 2 * (this.height + this.width);
    }
}

class Triangle implements Shape {
    private double edge1;
    private double edge2;
    private double edge3;

    Triangle(double edge1, double edge2, double edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    public double calculateArea() {
        double s = (this.edge1 + this.edge2 + this.edge3) / 2;
        return Math.sqrt(s * (s - this.edge1) * (s - this.edge2) * (s - this.edge3));
    }

    public double calculatePerimeter() {
        return this.edge1 + this.edge2 + this.edge3;
    }
}

class Square implements Shape {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public double calculateArea() {
        return this.edge * this.edge;
    }

    public double calculatePerimeter() {
        return 4 * this.edge;
    }
}

class WeighingTrapezoid implements Shape {
    private double height;
    private double bigWidth;
    private double smallWidth;

    WeighingTrapezoid(double height, double smallWidth, double bigWidth) {
        this.height = height;
        this.smallWidth = smallWidth;
        this.bigWidth = bigWidth;
    }

    public double calculateArea() {
        return (this.bigWidth + this.smallWidth) / 2 * this.height;
    }

    public double calculatePerimeter() {
        return this.bigWidth + this.smallWidth + 2 * Math.sqrt((this.bigWidth - this.smallWidth) * (this.bigWidth - this.smallWidth) + this.height * this.height);
    }
}