package week28;

public class BubbleSort {
	public static void bubbleSort(int[] list) {
		boolean change = true;
		for (int k = 0; k < list.length - 1 && change; k++) {
			change = false;
			for (int i = 0; i < list.length - 1 - k; i++) {
				if (list[i] > list[i + 1]) {
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					change = true;
				}
			}
		}
	}
}