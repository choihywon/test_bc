class Rectangle extends Shape implements ShapeInterface {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle ");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // 사각형의 면적 계산
    }
}