package week28;

import java.util.Random;

public class MeasureSortEfficiency {

    private static int[] generateIntArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {

        long startTime;

        System.out.println("Array size      Selection Sort      Bubble Sort     Merge Sort      Quick Sort");
        int[] sizes = new int[]{50000, 100000, 150000, 200000, 250000, 300000};
        int[] arr;

        for (int size : sizes) {

            arr = generateIntArray(size);
            // Selection Sort
            startTime = System.nanoTime();
            SelectionSort.selectionSort(arr);
            double selectionSortTime = (System.nanoTime() - startTime) / 1000000.0;

            arr = generateIntArray(size);
            // Bubble Sort
            startTime = System.nanoTime();
            BubbleSort.bubbleSort(arr);
            double bubbleSortTime = (System.nanoTime() - startTime) / 1000000.0;

            arr = generateIntArray(size);
            // Selection Sort
            startTime = System.nanoTime();
            MergeSort.mergeSort(arr);
            double mergeSortTime = (System.nanoTime() - startTime) / 1000000.0;

            arr = generateIntArray(size);
            // Selection Sort
            startTime = System.nanoTime();
            QuickSort.quickSort(arr);
            double quickSortTime = (System.nanoTime() - startTime) / 1000000.0;

            System.out.printf("%d\t\t\t%12.2fms\t\t%6.2fms\t\t%6.2fms\t\t%6.2fms\n", size, selectionSortTime, bubbleSortTime, mergeSortTime, quickSortTime);
        }

    }

}
