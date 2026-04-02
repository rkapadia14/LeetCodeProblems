package com.leetcode.prefixsum;

/*
Leetcode Problem No: 523

Leetcode Problem Name: Continuous Subarray Sum

Problem Statement: Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

A good subarray is a subarray where:
1. its length is at least two, and
2. the sum of the elements of the subarray is a multiple of k.

Note that:
A subarray is a contiguous part of the array.
An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.

Problem Type: Prefix Sum 

Space Complexity: O(n)

Time Complexity: O(n)

Difficulty Level: Medium

 */


import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {

	public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        hm.put(0, -1);
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            int rem = k == 0 ? sum : ((sum % k + k) % k); //To handle negatives
            if(hm.containsKey(rem)) {
                if(i - hm.get(rem) >= 2) 
                    return true; // subarray length >= 2
            }
            else 
                hm.put(rem, i); // store first occurrence
        
        }
        return false;

    }
	public static void main(String[] args) {
		int[] nums1 = {23,2,4,6,7};
		int[] nums2 = {23,2,6,4,7};
		System.out.println("Is nums with k(6) a continuous subarray sum? "+checkSubarraySum(nums1, 6));
		//Output: true
		System.out.println("Is nums with k(6) a continuous subarray sum? "+checkSubarraySum(nums2, 6));
		//Output: true
		System.out.println("Is nums with k(13) a continuous subarray sum? "+checkSubarraySum(nums2, 13));
		//Output: false
	}

}
