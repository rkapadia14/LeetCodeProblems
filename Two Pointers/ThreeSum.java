import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Leetcode Problem No: 15
//Difficulty Level: Medium
//Problem Statement: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.

public class ThreeSum {
     public static List<List<Integer>> threeSumFindList(int[] nums) {
       List<List<Integer>> list = new ArrayList<List<Integer>>();
       Arrays.sort(nums);
        
       for(int i=0;i<nums.length;i++)
       {
            if (i > 0 && nums[i] == nums[i-1] )
                continue;
            int left = i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) 
                        left++;
                    while(left < right && nums[right] == nums[right+1]) 
                        right--;
                }
                else if(nums[i]+nums[left]+nums[right]<0){
                        left++;
                }
                else
                    right--;
            }
       }
       return list;
     }
     public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> finalResult = threeSumFindList(nums);
        for (List<Integer> innerList : finalResult) { 
            for (Integer item : innerList) { 
                System.out.print(item + " "); 
            } 
            System.out.println(); // Move to the next line after each inner list 
        } 
     }


    
}