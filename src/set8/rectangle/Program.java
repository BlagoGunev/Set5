package set8.rectangle;

public class Program {

    public static void main(String[] args) {

        Rectangle a = new Rectangle(5.0, 7.0);
        Rectangle b = new Rectangle(3.0, 8.0);

        setColors(a, b);

        System.out.println("First rectangle color: " + a.color);
        System.out.println("Second rectangle color: " + b.color);
    }

    public static void setColors(Rectangle a, Rectangle b) {
        double perimeterA = a.getPerimeter();
        double perimeterB = b.getPerimeter();

        a.color = perimeterA > perimeterB ? "yellow" : "green";
        b.color = perimeterA > perimeterB ? "green" : "yellow";
    }

}
