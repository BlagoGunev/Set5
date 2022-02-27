package week21;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        System.out.println("The move count is: " + moveCount(n));
    }

    public static int moveCount(int n) {
        if (n == 1)
            return 1;
        else {
            return 2 * moveCount(n-1) + 1;
        }
    }
}
