/*
Leetcode Problem No: 713

Leetcode Problem Name: Subarray Product Less Than K

Problem Statement: Given an array of integers nums and an integer k, 
return the number of contiguous subarrays where the product of all the elements 
in the subarray is strictly less than k.

Problem Type: Variable Size Sliding Window 

Space Complexity: O(1)

Time Complexity: O(n)

Difficulty Level: Medium

 */

package com.leetcode.slidingwindow.variable;

public class SubarrayProductLessThanK {

	public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int left =0;
        int count=0;
        int product= 1;
        if(k <= 1) return 0; //Important
        for(int i=0;i<nums.length;i++)
        {
            product = product * nums[i];
            while(product>=k)
            {
                product = product/nums[left];
                left++;
            }
            count += i - left + 1;
        }
        return count;
        
    }
	public static void main(String[] args) {
		int[] nums1 = {10,5,2,6};
		int[] nums2 = {1,2,3};
		System.out.println("No of subarrays in the arrays nums1 with product of its elements less than K(100) are"+numSubarrayProductLessThanK(nums1, 100));
		//Output: 8
		System.out.println("No of subarrays in the arrays nums2 with product of its elements less than K(0) are"+numSubarrayProductLessThanK(nums2, 0));
		//Output: 0
	}

}
