package CRIO_DS_solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//Implement your solution here
class FindAllAnagramsInAString {

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> ans = new ArrayList<>();

		int k = p.length();
		int n = s.length();

		HashMap<Character, Integer> h1 = new HashMap<>();

		HashMap<Character, Integer> h2 = new HashMap<>();

		for (char c : p.toCharArray()) {
			if (h1.containsKey(c)) {
				h1.put(c, h1.get(c) + 1);
			} else {
				h1.put(c, 1);
			}
		}
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (i < k) {

				if (h2.containsKey(c)) {
					h2.put(c, h2.get(c) + 1);
				} else {
					h2.put(c, 1);
				}
				if (i == k - 1) {
					if (h1.equals(h2)) {
//						System.out.println(h1.equals(h2));
						ans.add(i - k + 1);
					}
				}
				continue;

			} else {

				if (h2.get(s.charAt(i - k)) > 1) {
					h2.put(s.charAt(i - k), h2.get(s.charAt(i - k)) - 1);

				} else {
//					System.out.println(h2);
					h2.remove(s.charAt(i - k));

				}
				if (h2.containsKey(c)) {
					h2.put(c, h2.get(c) + 1);
				} else {
					h2.put(c, 1);
				}

			}
			if (h1.equals(h2)) {
//				System.out.println(h1.equals(h2));
				ans.add(i - k + 1);
			}

		}

		return ans;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = new String[2];
		input = scanner.nextLine().split(" ");
		String s = input[0];
		String p = input[1];
		scanner.close();

		List<Integer> result = new FindAllAnagramsInAString().findAnagrams(s, p);
		System.out.println(result.size());
		for (Integer i = 0; i < result.size(); ++i) {
			System.out.printf("%d ", result.get(i));
		}
	}
}