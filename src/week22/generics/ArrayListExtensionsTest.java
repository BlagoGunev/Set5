package week22.generics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExtensionsTest {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        ArrayListExtensions.printList(array);
        ArrayListExtensions.shuffle(array);
        ArrayListExtensions.printList(array);

        ArrayListExtensions.sort(array);
        ArrayListExtensions.printList(array);

        System.out.println("Min element = " + ArrayListExtensions.<Integer>min(array));
    }

}
