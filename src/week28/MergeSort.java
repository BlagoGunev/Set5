package week28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeSort {
	/** The method for sorting the numbers */
	public static void mergeSort(int[] list) {
		if (list.length > 1) {
// Merge sort the first half
			int[] firstHalf = new int[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);
// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
// Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, list);
		}
	}

	/** Merge two sorted lists */
	public static void merge(int[] list1, int[] list2, int[] temp) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1] < list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}

	public static <E extends Comparable<E>> void mergeSort(E[] list) {
		ArrayList<E> toSort = new ArrayList<>(Arrays.stream(list).toList());
		mergeSortList(toSort);
		for (int i = 0; i < list.length; i++) {
			list[i] = toSort.get(i);
		}
	}

	private static <E extends Comparable<E>> void mergeSortList(List<E> list) {
		if (list.size() <= 1) {
			return;
		}
		ArrayList<E> firstHalf = new ArrayList<>(list.subList(0, list.size() / 2));
		mergeSortList(firstHalf);
		ArrayList<E> secondHalf = new ArrayList<>(list.subList(list.size()/ 2, list.size()));
		mergeSortList(secondHalf);

		list.clear();
		int current1 = 0;
		int current2 = 0;

		while (current1 < firstHalf.size() && current2 < secondHalf.size()) {
			if (firstHalf.get(current1).compareTo(secondHalf.get(current2)) < 0)
				list.add(firstHalf.get(current1++));
			else
				list.add(secondHalf.get(current2++));
		}
		while (current1 < firstHalf.size())
			list.add(firstHalf.get(current1++));
		while (current2 < secondHalf.size())
			list.add(secondHalf.get(current2++));
	}

	public static <E> void mergeSort(E[] list, Comparator<? super E> comparator) {
		ArrayList<E> toSort = new ArrayList<>(Arrays.stream(list).toList());
		mergeSortList(toSort, comparator);
		for (int i = 0; i < list.length; i++) {
			list[i] = toSort.get(i);
		}
	}

	private static <E> void mergeSortList(List<E> list, Comparator<? super E> comparator) {
		if (list.size() <= 1) {
			return;
		}
		ArrayList<E> firstHalf = new ArrayList<>(list.subList(0, list.size() / 2));
		mergeSortList(firstHalf, comparator);
		ArrayList<E> secondHalf = new ArrayList<>(list.subList(list.size()/ 2, list.size()));
		mergeSortList(secondHalf, comparator);

		list.clear();
		int current1 = 0;
		int current2 = 0;

		while (current1 < firstHalf.size() && current2 < secondHalf.size()) {
			if (comparator.compare(firstHalf.get(current1),secondHalf.get(current2)) < 0)
				list.add(firstHalf.get(current1++));
			else
				list.add(secondHalf.get(current2++));
		}
		while (current1 < firstHalf.size())
			list.add(firstHalf.get(current1++));
		while (current2 < secondHalf.size())
			list.add(secondHalf.get(current2++));
	}

	/** A test method */
	public static void main(String[] args) {
		Integer[] list = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		mergeSort(list, Integer::compare);
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
}

interface Builder<E> {
	public E build();
}