class Triangle extends Shape implements ShapeInterface {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("Triangle ");
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}