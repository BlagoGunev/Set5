package set6.loops;

public class Problem3 {

    public static void main(String[] args) {

        final int n = 5000;

        double sum = 0;
        for (int i = n; i > 0; i--) {
            sum += 1.0 / i;
        }

        System.out.println(sum);
    }

}
