
//**Leetcode Problem No: 27
//**Level: Easy
//**Problem Statement: Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//**Time Complexity: O(n)
//**Space Complexity: O(1)
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i= nums.length-1;
        int j = i;
        while(i>=0){
            if(nums[i]==val){
                nums[i] = nums[j];
                j--;
            }
            i--;
        }
        int k=0;
        System.out.println("===New array is===");
        while(k<j+1){
            System.out.println(nums[k]);
            k++;
          }
        return j+1;    
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        RemoveElement element = new RemoveElement();
        int result = element.removeElement(nums,val);
       System.out.println("No fo values replaced::"+result);
    }
    
}
