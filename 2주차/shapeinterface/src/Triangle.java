class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeType() {
        return "삼각형";
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}