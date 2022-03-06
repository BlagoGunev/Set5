package week22.generics;

import java.util.Scanner;

public class QueueTestGenerics {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            int v = scanner.nextInt();
            queue.enqueue(v);
        }

        while (!queue.empty()) {
            System.out.println(queue.dequeue());
        }
    }

}
