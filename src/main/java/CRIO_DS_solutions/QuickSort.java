package CRIO_DS_solutions;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(30);
		System.out.println(n);
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		quicksort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void quicksort(int arr[]) {
		quicksort(arr, 0, arr.length - 1);

	}

	static void quicksort(int arr[], int lowerindex, int higherindex) {
		if (lowerindex >= higherindex) {
			return;
		}
		int pivotIndex = new Random().nextInt(higherindex - lowerindex) + lowerindex;

		int p = arr[pivotIndex];
		swap(arr, higherindex, pivotIndex);
		int l = partition(arr, lowerindex, higherindex, p);

		quicksort(arr, lowerindex, l - 1);
		quicksort(arr, l + 1, higherindex);

	}

	private static int partition(int[] arr, int lowerindex, int higherindex, int p) {
		int l = lowerindex;
		int r = higherindex;
		while (l < r) {
			while (arr[l] <= p && l < r) {
				l++;
			}
			while (arr[r] >= p && l < r) {
				r--;
			}
			swap(arr, r, l);
		}
		swap(arr, l, higherindex);
		return l;
	}

	public static void swap(int arr[], int r, int l) {
		int t = arr[r];
		arr[r] = arr[l];
		arr[l] = t;
	}

}
