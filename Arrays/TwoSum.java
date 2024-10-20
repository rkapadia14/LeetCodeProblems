import java.util.HashMap;

//Leetcode Problem No: 1
//Level: Easy
//Problem Statement: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);
        }
            
        
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i]) && hm.get(target-nums[i]) != i)
                return new int[]{i,hm.get(target-nums[i])};
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] result = twoSum(nums, 9);
        for (int i : result) {
            System.err.print(i + " ");
        }
    }
}