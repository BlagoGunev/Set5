package set16;

import java.math.BigInteger;

public class Problem1 {

    public static void main(String[] args) {

        BigInteger num = new BigInteger("10").pow(49);

        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");

        int count = 0;
        while (count < 10) {

            if (num.mod(two).equals(new BigInteger("0")) || num.mod(three).equals(new BigInteger("0"))) {
                System.out.printf("%s\n", num);
                count++;
            }

            num = num.add(one);
        }

    }

}
