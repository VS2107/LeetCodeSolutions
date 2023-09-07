//Given an integer array nums, find the subarray  with the largest sum, and return its sum.
//Example:
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.

public class Solution {
	
	public static int maxSubArray(int[] nums) {
		int len = nums.length;
		if(len == 1)
			return nums[0];
		int sum = nums[0], temp =0;
		int i = 0;
		while(i<len) {
			if(temp < 0) 
				temp = 0;
			temp = temp + nums[i];
			sum = Math.max(sum,temp );
			i++;
		}
		return sum;
    }
}
