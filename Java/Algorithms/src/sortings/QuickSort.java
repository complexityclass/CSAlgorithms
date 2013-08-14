package sortings;

import java.util.Random;

/**
 * @author complexityclass
 * @version 0.1
 * 
 */

public class QuickSort {

	private int[] arr;
	public static final int MAX_VALUE = 65535;

	public QuickSort(int[] nArr) {

		this.arr = nArr;
	}

	/**
	 * @param arr
	 *            : int[] sort array
	 * @param first
	 *            : int first element index
	 * @param last
	 *            : int last element index
	 * */
	private void sort(int[] arr, int first, int last) {

		int low = first;
		int high = last;
		int pivot = (arr[first] + arr[last]) / 2;

		while (low <= high) {

			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}

			if (low <= high) {
				int swap = arr[low];
				arr[low] = arr[high];
				arr[high] = swap;

				low++;
				high--;
			}

		}

		if (first < high) {
			sort(arr, first, high);
		}
		if (low < last) {
			sort(arr, low, last);
		}

	}

	public void sortArray() {
		sort(arr, 0, arr.length - 1);
	}

	public void print() {
		if (arr.length > 0) {

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

		} else {
			System.out.println("array is empty");
		}

	}

}
