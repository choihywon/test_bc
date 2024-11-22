abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    // 이름 반환
    public String getName() {
        return name;
    }

    // 면적 계산 추상 메서드
    public abstract double calculateArea();
}

