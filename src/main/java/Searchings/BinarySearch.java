package Searchings;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int l = 0;
		int r = n - 1;
		int x = sc.nextInt();
		boolean ans = search(a, l, r, x);
		System.out.println(ans);

	}

	private static boolean search(int[] a, int l, int r, int x) {

		while (l <= r) {
			int m = (l + r) / 2;
			
			if (a[m] == x) {
				return true;
			} 
			else if (a[m] > x) {
				l=0;
				r=m-1;
				
			} else {
				l=m+1;
				r=r-1;

			}

		}
		return false;
	}

}
