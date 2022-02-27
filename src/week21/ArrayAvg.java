package week21;

import java.util.Scanner;

public class ArrayAvg {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }

        System.out.println("The average is " + average(arr, size, size, 0));

    }

    public static double average(double[] arr, int size, int initialSize, double result) {
        if (size == 0) {
            return result;
        }
        return average(arr, size - 1, initialSize,(result * (initialSize - size) + arr[size - 1]) / (initialSize - size + 1));
    }

}
