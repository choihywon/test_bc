abstract class Shape {
    protected String shapeType;
    protected double area;

    public abstract void calculateArea();

    public void displayInfo() {
        System.out.printf("%s의 면적: %.2f%n", shapeType, area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.shapeType = "원: ";
    }

    @Override
    public void calculateArea() {
        this.area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.shapeType = "사각형: ";
    }

    @Override
    public void calculateArea() {
        this.area = length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.shapeType = "삼각형: ";
    }

    @Override
    public void calculateArea() {
        this.area = 0.5 * base * height;
    }
}