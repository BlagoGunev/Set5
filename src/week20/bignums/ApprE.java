package week20.bignums;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApprE {

    public static void main(String[] args) {

        BigDecimal e = new BigDecimal("1.0").setScale(25, RoundingMode.HALF_EVEN);
        BigDecimal addit = BigDecimal.ONE.setScale(25, RoundingMode.HALF_EVEN);

        for (int i = 1; i <= 1000; i++) {
            addit = addit.divide(new BigDecimal(i), RoundingMode.HALF_EVEN);
            e = e.add(addit);

            if (i % 100 == 0) {
                System.out.println(i + " " + e);
            }

        }

    }

}
