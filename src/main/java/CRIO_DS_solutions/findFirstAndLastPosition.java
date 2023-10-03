package CRIO_DS_solutions;

import java.util.Arrays;

public class findFirstAndLastPosition {

	public static void main(String[] args) {
		int nums[]= {1,2,2,3,4};
		int x=2;
		System.out.println(Arrays.toString(findFirstAndLastPositionOfElementInSortedArray(nums,x)));

	}

	public static int[] findFirstAndLastPositionOfElementInSortedArray(int[] nums, int target) {
		int[] answer = new int[2];
		answer[0] = first(nums, nums.length, target);
		answer[1] = last(nums, nums.length, target);

		return answer;
	}

	public static int first(int[] a, int n, int x) {
		int res = -1;
		int l = 0;
		int r = n - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m] > x) {
				r = m - 1;
			} else if (a[m] < x) {
				l = m + 1;
			} else {
				res = m;
				r = m - 1;
			}
		}
		return res;
	}

	public static int last(int[] a, int n, int x) {
		int res = -1;
		int l = 0;
		int r = n - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m] > x) {
				r = m - 1;
			} else if (a[m] < x) {
				l = m + 1;
			} else {
				res = m;
				l = m + 1;
			}
		}
		return res;
	}
}
