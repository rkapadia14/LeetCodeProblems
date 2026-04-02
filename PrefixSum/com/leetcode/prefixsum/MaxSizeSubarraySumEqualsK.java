/*
Leetcode Problem No: 325

Leetcode Problem Name: Maximum Size Subarray Sum Equals K

Problem Statement: Given an integer array nums and an integer k, 
return the maximum length of a subarray that sums to k. 
If there is not one, return 0 instead.

Problem Type: Prefix Sum 

Space Complexity: O(n)

Time Complexity: O(n)

Difficulty Level: Medium

 */

package com.leetcode.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class MaxSizeSubarraySumEqualsK {

	public static int maxSubArrayLen(int[] nums, int k) {
		Map<Integer, Integer> hm = new HashMap<>();
		int sum = 0;
		int maxLen = 0;
		hm.put(0, -1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (hm.containsKey(sum - k))
				maxLen = Math.max(maxLen, i - hm.get(sum - k));

			if (!hm.containsKey(sum))
				hm.put(sum, i);
		}
		return maxLen;
	}
	public static void main(String[] args) {
		int[] nums1 = {1,-1,5,-2,3};
		int[] nums2 = {-2,-1,2,1};
		System.out.println("SubArray Count Equals K(3) for nums1 is: "+maxSubArrayLen(nums1, 2));
		//Output: 2
		System.out.println("SubArray Count Equals K(1) for nums2 is: "+maxSubArrayLen(nums2, 3));
		//Output: 2

	}

}
