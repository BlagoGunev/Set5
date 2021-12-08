package set14;

public class PointTests {

    public static void main(String[] args) {
        MyPoint A = new MyPoint(0, 0);
        MyPoint B = new MyPoint(10, 30.5);

        System.out.printf("distance: %f\n", A.distance(B));
        System.out.printf("distance: %f\n", MyPoint.distance(A, B));
    }

}
