package set7.circle;

public class Circle {

    public double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2.0 * radius * Math.PI;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}
