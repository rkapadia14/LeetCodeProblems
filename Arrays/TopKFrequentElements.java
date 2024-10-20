import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Leetcode Problem No: 347
//Level: Medium
//Problem Statement: Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer,Integer> hm = new HashMap<>();
        for(int num:nums)
            hm.put(num, hm.getOrDefault(num,0) + 1);
        
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {    
                if(bucket[entry.getValue()]==null)
                {
                    bucket[entry.getValue()] = new ArrayList<Integer>();

                }
                bucket[entry.getValue()].add(entry.getKey());

        }
        int[] result = new int[k];
        int pos=0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && pos < k; j++) {
                    result[pos] = bucket[i].get(j);
                    pos++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k=2;
        int [] result = topKFrequent(nums,k);
        System.err.print("Top "+ k +" Frequent Elements are::");
        for (int i : result) {
            System.err.print(i+" ");
        }
    }
}

