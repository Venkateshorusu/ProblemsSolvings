package CRIO_DS_solutions;

import java.util.*;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        int n = arr.length;

        // Create a stack to store indices of array elements
        Stack<Integer> stack = new Stack<>();

        // Create an array to store the next smaller elements
        int[] nextSmaller = new int[n];
        Arrays.fill(nextSmaller, -1);

        // Iterate over the array from right to left
        for (int i = 0; i < n; i++) {
            // Pop elements from the stack while they are greater than arr[i]
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                nextSmaller[stack.pop()] = arr[i];
            }
            // Push the current index onto the stack
            stack.push(i);
        }

        // Print the next smaller elements
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + nextSmaller[i]);
        }
    }
}
