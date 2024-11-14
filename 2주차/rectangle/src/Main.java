
abstract class Shape {
    protected String shapeType;
    public abstract double getArea();

    public String getShapeType() {
        return shapeType;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.shapeType = "원";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.shapeType = "사각형";
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.shapeType = "삼각형";
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 7.0);

        for (Shape shape : shapes) {
            System.out.println(shape.getShapeType() + "의 면적: " + shape.getArea());
        }
    }
}
