package week20.bignums;

import java.math.BigInteger;

public class LargePrimes {

    public static void main(String[] args) {

        BigInteger bigInteger = new BigInteger(String.valueOf(Long.MAX_VALUE));

        int count = 0;
        for (; count < 5; bigInteger = bigInteger.add(BigInteger.ONE)) {
            if (bigInteger.isProbablePrime(20)) {
                System.out.println(bigInteger);
                count++;
            }
        }

    }

}
