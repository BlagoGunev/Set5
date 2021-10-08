package set8.rectangle;

public class Rectangle {

    public double width = 1.0;
    public double height = 1.0;
    public String color = "null";

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {}

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
