package week21;

public class XMethod1 {

    public static void main(String[] args) {
        System.out.println("Sum is " + xMethod(5));

        final int N = 5;
        int xmethodsum = 0;
        for (int i = 1; i <= N; i++) {
            xmethodsum += i;
        }

        System.out.println("Sum calculated iteratively: " + xmethodsum);

        System.out.println("Sum calculated with recursion optimization: " + xMethodOptimized(N, 0));
    }

    public static int xMethod(int n) {
        if (n == 1)
            return 1;
        else
            return n + xMethod(n - 1);
    }

    public static int xMethodOptimized(int n, int result) {
        if (n == 0)
            return result;
        else
            return xMethodOptimized(n - 1, result + n);
    }

}
