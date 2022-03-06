package week22.generics;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListExtensions {

    public static <E> void shuffle(ArrayList<E> list) {

        Random random = new Random();

        int size = list.size();
        for (int i = 0; i < size * 10; i++) {
            int x = random.nextInt(size);
            int y = random.nextInt(size);
            E temp = list.get(x);
            list.set(x, list.get(y));
            list.set(y, temp);
        }

    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i+1; j < size; j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    E temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        E ans = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(ans) < 0) {
                ans = list.get(i);
            }
        }
        return ans;
    }

    public static <E> void printList(ArrayList<E> list) {
        System.out.println(list.toString());
    }

}
