//Leetcode Problem No: 167
//Difficulty Level: Medium
//Problem Statement: Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target)
                return new int[] { i + 1, j + 1 };
            else if (numbers[i] + numbers[j] < target)
                i++;
            else if (numbers[i] + numbers[j] > target)
                j--;
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println("The digits at indices numbers["+ (result[0]-1) +"]="+numbers[result[0]-1] + " and numbers[" + (result[1]-1)+"]="+numbers[result[1]-1] + " add to the target of "+ target);
    }
}
