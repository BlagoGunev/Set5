package set14;

public class MyPoint {
    
    private double x = 0;
    private double y = 0;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {}

    public double getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double distance(MyPoint point) {
        return distance(point.getX(), point.getY());
    }

    public double distance(double x, double y) {
        return Math.sqrt((x - this.x) * (x - this.x)
                + (y - this.y) * (y - this.y));
    }

    public static double distance(MyPoint A, MyPoint B) {
        return Math.sqrt((A.x - B.x) * (A.x - B.x)
                + (A.y - B.y) * (A.y - B.y));
    }
}
