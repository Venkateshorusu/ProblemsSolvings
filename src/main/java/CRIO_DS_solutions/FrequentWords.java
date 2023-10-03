/*
You are given a list of words present in a book. Your younger brother is really 
curious to know the K most frequent words in the book, you have to find them.

Your answer should be sorted by frequency from highest to lowest. 
If two words have the same frequency, then the word with the lower alphabetical order should come first.

Input format
There are three lines of input

The first line contains N, which is the number of input strings.

The second line contains N space separated input strings (S).

The third line contains the value of K.

Output format
Print the K most frequent words present inside the book, each in a new line. 
If two words have the same frequency, then the word with the lower alphabetical order should come first.

*Sample Input 1
1

bus

1

Sample Output 1
bus

Explanation 1
In the given input, the frequency of "bus" is 1 and it is the 1st most frequent word.

Sample Input 2
3

car bus car

2

Sample Output 2
car

bus

Explanation 2
In the given input, the frequency of "car" is 2, frequency of “bus” is 1.

Since K = 2, both words are printed, with "car" being the most frequent, gets printed first.
*
*
*/

package CRIO_DS_solutions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class FrequentWords {
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				if (o1.getValue() == o2.getValue()) { 

					if (o1.getKey().compareTo(o2.getKey()) > 0) {
						return 1;
					} else {
						return -1;
					}

				}
				if (o1.getValue() > o2.getValue()) {
					return -1;
				} else {
					return 1;
				}

			}
		});

		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

	public static Vector<String> frequentWords(Vector<String> vec, int k)

	{
		HashMap<String, Integer> h = new HashMap<>();
		Vector<String> ans = new Vector<String>();

		for (String s : vec) {
			if (h.containsKey(s)) {
				h.put(s, h.get(s) + 1);
			} else {
				h.put(s, 1);
			}
		}
		Map<String, Integer> hm1 = sortByValue(h);

		Set<String> keys = hm1.keySet();

		/*
		 * Convert it to an ArrayList
		 * h
a
agrbixw
asp
avhph
bcdtynvs
bpxhyu
btulnbt
bzvmwrxila
cb
cgqeajsyou
clqdhfrl
e
ev
fcivdkonsb
		 */
		Vector<String> listKeys = new Vector<String>(keys);
		for (int i = 0; i < k; i++) {
			ans.add(listKeys.get(i));
		}
		return ans;

	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector<String> vec = new Vector<String>();
		for (int i = 0; i < n; i++)
			vec.add(sc.next());
		int k = sc.nextInt();
		Vector<String> ans = frequentWords(vec, k);
		for (int i = 0; i < k; i++)
			System.out.println(ans.get(i));
	}

}
