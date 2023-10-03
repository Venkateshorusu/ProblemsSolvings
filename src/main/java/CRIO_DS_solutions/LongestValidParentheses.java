package CRIO_DS_solutions;

import java.util.*;

public class LongestValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = longestValidParentheses(s);
        System.out.println(result);
    }
//     1 2 
//    ml=2 2 6
    public static int longestValidParentheses(String str) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // push a sentinel value to mark the start of the substring
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(i); // push the index of the opening parenthesis
            } else { // c == ')'
                stack.pop(); // pop the matching opening parenthesis index
                if (stack.empty()) { // stack is empty, no more matching pairs
                    stack.push(i); // push the closing parenthesis index as the new sentinel
                } else { // stack is not empty, compute the length of the current substring
                    int len = i - stack.peek();
                    maxLen = Math.max(maxLen, len);
                }
            }
        }
        return maxLen;
    }
}

