class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public String getShapeType() {
        return "사각형";
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}