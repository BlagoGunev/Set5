package set5.algs;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN: ");
        String isbn = scanner.nextLine();

        int sumOfFirstDigits = 0;
        for (int i = 0; i < 9; i++) {
            sumOfFirstDigits += (i + 1) * Integer.parseInt(isbn.substring(i, i+1));
        }

        int lastDigit = sumOfFirstDigits % 11;
        char lastDigitSymbol = lastDigit < 10 ? (char) (lastDigit + '0') : 'X';
        System.out.printf("The ISBN-10 number is %s%c", isbn, lastDigitSymbol);

    }

}
