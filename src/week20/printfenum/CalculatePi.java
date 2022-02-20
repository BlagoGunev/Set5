package week20.printfenum;

public class CalculatePi {

    public static void main(String[] args) {

        double pi = 0;
        double baseOfAddition = 4;

        for (int i = 1; i < 902; i++) {
            pi += baseOfAddition / (2.0 * i - 1.0);
            baseOfAddition *= -1;

            if (i % 100 == 1) {
                System.out.printf("%-3d      %6.4f\n", i, pi);
            }

        }

    }

}
