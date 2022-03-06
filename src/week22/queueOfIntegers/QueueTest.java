package week22.queueOfIntegers;

import java.util.Scanner;

public class QueueTest {

    public static void main(String[] args) {
        QueueOfIntegers queue = new QueueOfIntegers();

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
