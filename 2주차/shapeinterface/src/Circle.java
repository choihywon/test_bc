class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String getShapeType() {
        return "원";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}