package week21;

public class OddEven {

    public static void main(String[] args) {
        final int n = 5;
        System.out.println("IsEven : " + even(n));
        System.out.println("IsOdd : " + odd(n));
    }

    public static boolean even(int n) {
        if (n == 0) {
            return true;
        } else if (n == 1) {
            return false;
        } else {
            return even(n - 2);
        }
    }
    public static boolean odd(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            return odd(n - 2);
        }
    }

}
