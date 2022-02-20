package week20.printfenum;

public class SumSeries {

    public static void main(String[] args) {

        double sum = 0.0;

        for (int i = 1; i < 50; i++) {
            double addit = (double)i / (i + 2);
            sum += addit;
            System.out.printf("%-2d      %7.4f\n", i, sum);
        }

    }

}
