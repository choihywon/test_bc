public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10.0);
        shapes[1] = new Rectangle(4, 4);
        shapes[2] = new Triangle(3, 3);

        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.displayInfo();
        }
    }
}
