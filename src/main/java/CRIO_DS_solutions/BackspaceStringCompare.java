package CRIO_DS_solutions;

import java.util.Scanner;
import java.util.Stack;

public class BackspaceStringCompare {
	public static void main(String args[]) {
		 

        try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while (t-- > 0) {

			    String S = sc.next();
			    String T = sc.next();

			    boolean res = backspaceStringCompare(S, T);

			    if (res)
			        System.out.println(true);
			    else
			        System.out.println(false);
			    
			}
		}

	}

	static String backspace(String s) {
		String ans = "";
		Stack<Character> st = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '#') {
				if (!st.isEmpty()) {
					st.pop();

				}

			} else {
				st.push(c);
			}
		}
		while (!st.isEmpty()) {
			ans = st.pop() + ans;
		} 
		return ans;
	}

	static boolean backspaceStringCompare(String S, String T) {
		String s1=backspace(S);
		String s2=backspace(T);
		if(s1.equals(s2)) {
			return true;
		}
		

		return false;

	}

}