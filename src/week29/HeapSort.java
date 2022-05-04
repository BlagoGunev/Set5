package week29;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapSort {

    public static <E extends Comparable<E>> void heapSort(E[] list) {
        Heap<E> heap = new Heap<>(list);
        for (int i = 0; i < list.length; i++) {
            list[list.length - i - 1] = heap.remove();
        }
    }

    public static <E> void heapSort(E[] list, Comparator<? super E> comparator) {
        PriorityQueue<E> queue = new PriorityQueue<E>(comparator);
        queue.addAll(Arrays.asList(list));
        for (int i = 0; i < list.length; i++) {
            list[i] = queue.remove();
        }
    }

}
