/*
Leetcode Problem No: 560

Leetcode Problem Name: Subarray Sum Equals K

Problem Statement: Given an array of integers nums and an integer k, 
return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Problem Type: Prefix Sum 

Space Complexity: O(n)

Time Complexity: O(n)

Difficulty Level: Medium

 */

package com.leetcode.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

	public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int sum=0, count =0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(hm.containsKey(sum-k))
                count += hm.get(sum-k);
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
	public static void main(String[] args) {
		int[] nums1 = {1,1,1};
		int[] nums2 = {1,2,3};
		System.out.println("SubArray Count Equals K(2) for nums1 is: "+subarraySum(nums1, 2));
		//Output: 2
		System.out.println("SubArray Count Equals K(3) for nums2 is: "+subarraySum(nums2, 3));
		//Output: 2
	}

}
