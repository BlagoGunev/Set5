package set11;
import java.util.Scanner;
import java.util.Random;

public class Problem1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < 1000; i++) {
            int ind1 = random.nextInt(10) % 10;
            int ind2 = random.nextInt(10) % 10;

            int t = array[ind1];
            array[ind1] = array[ind2];
            array[ind2] = t;
        }

        for(int num : array) {
            System.out.println(num);
        }

    }

}
