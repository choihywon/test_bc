public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.0);
        shapes[1] = new Rectangle(4, 4);
        shapes[2] = new Triangle(4, 4);

        // 각 도형의 면적을 계산하여 출력합니다.
        for (Shape shape : shapes) {
            System.out.printf("%s: %.2f%n", shape.getShapeType(), shape.calculateArea());
        }
    }
}