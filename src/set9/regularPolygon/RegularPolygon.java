package set9.regularPolygon;

public class RegularPolygon {

    private int n = 3; // number of sides
    private double sideLength = 1.0;
    private double x = 0.0;
    private double y = 0.0;

    public RegularPolygon() {}

    public RegularPolygon(int n, double sideLength) {
        this(n, sideLength, 0.0, 0.0);
    }

    public RegularPolygon(int n, double sideLength, double x, double y) {
        this.n = n;
        this.sideLength = sideLength;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter() {
        return (double) n * sideLength;
    }

    public double getArea() {
        return (sideLength * sideLength * n) / (4 * Math.tan(Math.PI / n));
    }

    public int getN() {
        return n;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
