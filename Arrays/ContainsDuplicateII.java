/*
 Leetcode Problem No: 219
Leetcode Problem Name: Contains Duplicate II
Level: Easy
Problem Statement: Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Time Complexity: O(n)
Space Complexity: O(n)
Technique Used: HashMap 
 */

import java.util.*;
class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]) && Math.abs(hm.get(nums[i]) -i)<=k)
                return true;
                hm.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k= 2;
        System.out.println(containsNearbyDuplicate(nums,k));
     }
     //Output: false
}