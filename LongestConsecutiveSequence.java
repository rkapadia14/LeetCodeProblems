import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int sequenceLength = 0;
        int maxSequenceLength = 0;
        for(int num:nums)
            hashSet.add(num);

        for(int num:nums)
        {
            if(!hashSet.contains(num-1))
            {
                sequenceLength = 1;
                while(hashSet.contains(num+sequenceLength))
                    sequenceLength = sequenceLength +1;
            }
            maxSequenceLength = Math.max(sequenceLength, maxSequenceLength);
                
            
        }
        return maxSequenceLength; 
    }
    public static void main(String[] args) {
        int [] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println("Longest Common Subsequence is::"+longestConsecutive(nums));
    }
}
