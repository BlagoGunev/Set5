package set17;

public class Circle extends GeometricObject{

    private double radius = 1.0f;

    public Circle() { }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void printCircle() {

    }
}
