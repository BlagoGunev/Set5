package week21;

import java.util.Scanner;

public class Apples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int paid = scanner.nextInt();
        System.out.println(recur(paid));

    }

    public static int recur(int n) {
        if (0 < n && n < 3) {
            return n;
        }
        return n % 3 == 0 ? 3 * recur(n/3) + 1 : recur(n - n % 3) + n % 3;
    }

}
