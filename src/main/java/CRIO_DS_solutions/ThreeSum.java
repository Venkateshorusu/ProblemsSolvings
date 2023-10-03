package CRIO_DS_solutions;


import java.util.*;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums); // sort array to avoid duplicates
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) { // skip duplicates
				int lo = i + 1, hi = nums.length - 1, sum = -nums[i];
				while (lo < hi) {
					if (nums[lo] + nums[hi] == sum) {
						res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
						while (lo < hi && nums[lo] == nums[lo + 1])
							lo++; // skip duplicates
						while (lo < hi && nums[hi] == nums[hi - 1])
							hi--; // skip duplicates
						lo++;
						hi--;
					} else if (nums[lo] + nums[hi] < sum)
						lo++;
					else
						hi--;
				}
			}
		}
		return res;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		List<List<Integer>> res = threeSum(nums);
		for (List<Integer> triplet : res) {
			for (int num : triplet) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
