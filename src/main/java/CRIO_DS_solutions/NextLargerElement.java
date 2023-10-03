package CRIO_DS_solutions;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {

	static int[] nextLargerElement(int nums[], int n) {
		int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < nums.length; i++) {
            // while there are elements in the stack and the current element is greater than the top of the stack
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                // update the result numsay with the next greater element for the top of the stack
            	// System.out.println(stack.peek());
                result[stack.pop()] = nums[i];
            }
            // push the current index onto the stack
            stack.push(i);
        }
        // for any elements remaining in the stack, there is no next greater element
        while (!stack.isEmpty()) {
        	// System.out.println(stack.peek());
            result[stack.pop()] = -1;
        }
        return result;

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int ar[] = new int[n];
			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
			}
			int[] ans = nextLargerElement(ar, n);
			for (int i = 0; i < ans.length; i++)
				System.out.print(ans[i] + " ");
		}
	}
}