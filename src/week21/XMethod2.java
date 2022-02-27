package week21;

public class XMethod2 {

    public static void main(String[] args) {
        xMethod(1234567);

        System.out.println();

        int n = 1234567;
        while (n > 0) {
            System.out.print(n % 10);
            n /= 10;
        }

    }

    public static void xMethod(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            xMethod(n / 10);
        }
    }


}
