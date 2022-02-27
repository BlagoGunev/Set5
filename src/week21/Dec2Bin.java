package week21;

import java.util.Scanner;

public class Dec2Bin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        System.out.println("In binary value is " + dec2bin(value));

    }

    public static String dec2bin(int value) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (value < 2) {
            return String.valueOf(value);
        }
        stringBuilder.append(dec2bin(value / 2));
        stringBuilder.append(value % 2);
        return stringBuilder.toString();
    }

}
