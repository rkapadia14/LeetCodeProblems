//LeetCode Problem No 217: ContainsDuplicate
//Problem Statement: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        ContainsDuplicate obj = new ContainsDuplicate();
        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);
    }
}
