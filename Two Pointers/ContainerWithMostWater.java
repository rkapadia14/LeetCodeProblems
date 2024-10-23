/*
Leetcode Problem No: 11
Difficulty Level: Medium
Problem Statement: You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
*/
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = -1;
        int left=0;
        int right = height.length-1;
        while(left<right){
            maxArea = Math.max(maxArea, (Math.min(height[right], height[left]) * (right-left)));
            if(height[left]<height[right])
                left++;
            else    
                right--;                
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max amount of water a container can store="+maxArea(nums));
    }

}
