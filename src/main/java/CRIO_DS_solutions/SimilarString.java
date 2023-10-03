package CRIO_DS_solutions;

import java.util.HashMap;
import java.util.Scanner;

class SimilarString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			String first_string = sc.next();
			String second_string = sc.next();
			String answer = similarString(n, m, first_string, second_string, k);
			System.out.println(answer);
		}
		sc.close();
	}

	static String similarString(int n, int m, String s, String t, int k) {
//		// Creating a hashmap to store frequency of each character in s
//		HashMap<Character, Integer> freq_s = new HashMap<>();
//		for (char ch : s.toCharArray()) {
//			freq_s.put(ch, freq_s.getOrDefault(ch, 0) + 1);
//		}
//
//		// Creating a hashmap to store frequency of each character in t
//		HashMap<Character, Integer> freq_t = new HashMap<>();
//		for (char ch : t.toCharArray()) {
//			freq_t.put(ch, freq_t.getOrDefault(ch, 0) + 1);
//		}
//
//		// Checking if the difference in frequency of each character in s and t is at
//		// most k
//		for (char ch : freq_s.keySet()) {
//			int diff = Math.abs(freq_s.get(ch) - freq_t.getOrDefault(ch, 0));
//			if (diff > k) {
//				return "No";
//			}
//		}
//		return "Yes";

		String yes = "Yes";
		String no = "No";
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> h2 = new HashMap<Character, Integer>();
		for (char c = 'a'; c <= 'z'; c++) {
			h1.put(c, 0);
			h2.put(c, 0);
		}
		for (char c : s.toCharArray()) {
			if (h1.containsKey(c)) {
				h1.put(c, h1.get(c) + 1);
			}
		}
		for (char c : t.toCharArray()) {
			if (h2.containsKey(c)) {
				h2.put(c, h2.get(c) + 1);
			}
		}
//		System.out.println(h1);
//		System.out.println(h2);

		for (char key : h1.keySet()) {
			if (h2.containsKey(key)) {
				if (Math.abs(h1.get(key) - h2.get(key)) > k) {
					return no;
				}

			}

		}

//
		return yes;

	}
}
