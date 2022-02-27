package week21;

import java.math.BigInteger;
import java.util.Scanner;

public class MathPower {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x, n;
        x = scanner.nextInt(); n = scanner.nextInt();

        BigInteger castX = new BigInteger(String.valueOf(x));

        System.out.println("Power recursively: " + powerRecursively(castX, n));
        System.out.println("Power recursively slow: " + powerRecursivelySlow(castX, n));
        System.out.println("Power iteratively: " + powerIteratively(castX, n));
    }

    private static BigInteger powerRecursively(BigInteger x, int n, BigInteger result) {
        if (n == 0) {
            return result;
        }
        return powerRecursively(x, n - 1, result.multiply(x));
    }

    public static BigInteger powerRecursively(BigInteger x, int n) {
        return powerRecursively(x, n, BigInteger.ONE);
    }

    public static BigInteger powerRecursivelySlow(BigInteger x, int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        return powerRecursivelySlow(x, n - 1).multiply(x);
    }

    public static BigInteger powerIteratively(BigInteger x, int n) {
        BigInteger ans = BigInteger.ONE;
        for (int i = 1; i <= n; i++ ) {
            ans = ans.multiply(x);
        }
        return ans;
    }

}
