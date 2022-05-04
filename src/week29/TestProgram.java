package week29;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestProgram {

    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }

        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);
        list.toArray(arr);
        System.out.println(Arrays.toString(arr));
        HeapSort.heapSort(arr);
        System.out.println(Arrays.toString(arr));

        list = Arrays.asList(arr);
        Collections.shuffle(list);
        list.toArray(arr);
        System.out.println(Arrays.toString(arr));
        HeapSort.heapSort(arr, Integer::compare);
        System.out.println(Arrays.toString(arr));

    }

}
