package week25;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Lidl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PriorityQueue<CheckoutLine> lines = new PriorityQueue<>();
        int n, m, k;

        n = scanner.nextInt(); k = scanner.nextInt(); m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            lines.add(new CheckoutLine(i, k));
        }

        for (int i = 0; i < n; i++) {
            int productsCount = i % k + 1;
            CheckoutLine line = lines.poll();
            line.push(productsCount);
            lines.add(line);
        }

        int[][] numberOfClientsWithNumberOfProducts = new int[m][];

        for (int i = 0; i < m; i++) {
            CheckoutLine line = lines.poll();
            numberOfClientsWithNumberOfProducts[line.number] = line.clientsWithNumberOfProducts;
        }

        for (int i = 0; i < m; i++) {
            printArray(numberOfClientsWithNumberOfProducts[i]);
        }
    }

    static void printArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    static class CheckoutLine implements Comparable<CheckoutLine> {

        public int productsCount;
        public int number;
        public int[] clientsWithNumberOfProducts;

        public CheckoutLine(int number, int capacity) {
            this.number = number;
            this.productsCount = 0;
            this.clientsWithNumberOfProducts = new int[capacity + 1];
        }

        public void push(int clientProductCount) {
            this.clientsWithNumberOfProducts[clientProductCount]++;
            productsCount += clientProductCount;
        }

        @Override
        public int compareTo(CheckoutLine o) {
            if (this.productsCount != o.productsCount) {
                return Integer.compare(this.productsCount, o.productsCount);
            }
            return Integer.compare(this.number, o.number);
        }
    }

}
