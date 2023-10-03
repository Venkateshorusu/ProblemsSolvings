package CRIO_DS_solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctElements {

	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int b = sc.nextInt();

			int arr[] = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			ArrayList<Integer> res = countDistinctElements(n, b, arr);

			for (int j : res)
				System.out.print(j + " ");
		}

	}

	static ArrayList<Integer> countDistinctElements(int N, int K, int arr[]) {

		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		// Traverse the first window and store count
		// of every element in hash map
		for (int i = 0; i < K; i++) {
			if(hM.containsKey(arr[i])) {
				hM.put(arr[i], hM.get(arr[i]) + 1);
			}
			else {
				hM.put(arr[i], 1);
			}
			
		}

		// Print count of first window
    	//	System.out.println(hM.size());
		ans.add(hM.size());

		// Traverse through the remaining array
		for (int i = K; i < arr.length; i++) {

			// Remove first element of previous window
			// If there was only one occurrence
			if (hM.get(arr[i - K]) == 1) {
				hM.remove(arr[i - K]);
			}

			else // reduce count of the removed element
				hM.put(arr[i - K], hM.get(arr[i - K]) - 1);

			// Add new element of current window
			// If this element appears first time,
			// set its count as 1,
			if(hM.containsKey(arr[i])) {
				hM.put(arr[i], hM.get(arr[i]) + 1);
			}
			else {
				hM.put(arr[i], 1);
			}

			// Print count of current window
			// System.out.println(hM.size());
			ans.add(hM.size());
		}

		return ans;

	}

}