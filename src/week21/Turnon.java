package week21;

import java.util.Scanner;

public class Turnon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(turnon(n));

    }

    public static String turnon(int n) {
        if (n == 1) {
            return "+1\n";
        }
        if (n == 2) {
            return "+1\n+2\n";
        }

        StringBuilder stringBuilder = new StringBuilder("+1\n");
        for (int i = 1; i < n; i++) {
            stringBuilder.append(lightNext(i));
        }
        stringBuilder.append(turnon(n - 2));
        return stringBuilder.toString();
    }

    public static String lightNext(int n) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (n > 1) {
            stringBuilder.append("-").append(n - 1).append("\n");
        }
        //stringBuilder.append("+").append(n).append("\n");
        stringBuilder.append("+").append(n+1).append("\n");

        return stringBuilder.toString();
    }

}
