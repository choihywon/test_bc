class Circle extends Shape implements ShapeInterface {
    private double radius;

    public Circle(double radius) {
        super("Circle ");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}