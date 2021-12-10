package set16;

import java.math.BigInteger;

public class Problem2 {

    public static void main(String[] args) {

        BigInteger num = new BigInteger(Long.toString(Long.MAX_VALUE));

        BigInteger one = new BigInteger("1");
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");

        int count = 0;
        while (count < 10) {
            num = num.add(one);

            if (num.mod(five).equals(new BigInteger("0")) || num.mod(six).equals(new BigInteger("0"))) {
                System.out.printf("%s\n", num);
                count++;
            }

        }

    }

}
