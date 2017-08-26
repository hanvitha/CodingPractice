package medium;

import java.util.Arrays;

public class ThreeSumClosest {
	public static void main(String[] args) {
		int[] y = { 1, 1, -1, -1, 3 };
		long t = System.currentTimeMillis();
		System.out.println(threeSum(y, -1));
		long t1 = (System.currentTimeMillis());
		System.out.println(t1 - t);

	}

	public static int threeSum(int[] nums, int t) {
		int result = nums[0] + nums[1] + nums[nums.length - 1];
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])// skip same result
				continue;
			int j = i + 1, k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if(sum>t){
					k--;
				}else
					j++;
				if(Math.abs(sum-t) < Math.abs(result-t)){
					result = sum;
				}
			}
		}
		return result;
	}

}
