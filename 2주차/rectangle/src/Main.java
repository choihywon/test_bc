
abstract class Shape {
    protected String shapeType;
    public abstract double getArea();

    // 도형의 종류를 출력하는 메서드
    public String getShapeType() {
        return shapeType;
    }
}

class Circle extends Shape {
    private double radius;

    // 생성자: 원의 반지름을 초기화합니다.
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

    // 생성자: 사각형의 길이와 너비를 초기화합니다.
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.shapeType = "사각형";
    }

    // 면적을 계산하는 메서드
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
