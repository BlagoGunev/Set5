package set9.regularPolygon;

public class RegularPolygonTests {

    public static void main(String[] args) {

        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("Object 1: Perimeter: %.2f , Area: %.2f", rp1.getPerimeter(), rp1.getArea());
        System.out.println();
        System.out.printf("Object 2: Perimeter: %.2f , Area: %.2f", rp2.getPerimeter(), rp2.getArea());
        System.out.println();
        System.out.printf("Object 3: Perimeter: %.2f , Area: %.2f", rp3.getPerimeter(), rp3.getArea());
        System.out.println();

    }

}
