package week20.bignums;

import java.math.BigInteger;

public class Mersenne {

    public static void main(String[] args) {

        BigInteger bigInteger = new BigInteger(String.valueOf(2));
        BigInteger test;

        for (int p = 2; p <= 100; p++) {
            bigInteger = bigInteger.multiply(BigInteger.TWO);
            test = bigInteger.subtract(BigInteger.ONE);

            if (test.isProbablePrime(20)) {
                System.out.printf("%3d %30s\n", p, test);
            }

        }

    }

}
