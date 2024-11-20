public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(3, 3);
        Shape triangle = new Triangle(3, 3);

        Shape[] shapes = {rectangle, triangle, circle};

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + shape.calculateArea());
        }
    }
}