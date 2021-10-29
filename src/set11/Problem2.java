package set11;
import java.util.Random;

public class Problem2 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[52];

        for (int i = 0; i < 52; i++) {
            array[i] = i;
        }

        for (int i = 0; i < 25000; i++) {
            int ind1 = random.nextInt(52) % 52;
            int ind2 = random.nextInt(52) % 52;

            int t = array[ind1];
            array[ind1] = array[ind2];
            array[ind2] = t;
        }



    }

}
