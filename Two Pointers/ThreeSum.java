import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Leetcode Problem No: 15
//Difficulty Level: Medium
//Problem Statement: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.

public class ThreeSum {
     public static List<List<Integer>> threeSumFindList(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        //Sorting the array first for using the two pointer approach while finding two sum
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if (i > 0 && nums[i] == nums[i-1] )
                continue;
            List<Integer> list = new ArrayList<>();
            int currentNo = nums[i];
            //Setting pointers to find other two numbers
            int left=i+1;
            int right = nums.length-1;
            while(left<right){
                list = new ArrayList<>();
                if(nums[left]+nums[right]+currentNo==0)
                {
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(currentNo);
                    result.add(list);
                    left++;
                    //To avoid duplicates
                    while(left < right && nums[left] == nums[left-1]) 
                        left++;
                }
                else if(nums[left]+nums[right]+currentNo<0)
                    left++;
                else right--;
            }
        }

        return result;
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