/*
Leetcode Problem No: 3

Leetcode Problem Name: Longest Substring Without Repeating Characters

Problem Statement: Given a string s, find the length of the longest substring 
without duplicate characters.

Problem Type: Variable Size Sliding Window 

Space Complexity: O(k), where k is the number of distinctive characters present in the hashset.

Time Complexity: O(n)

Difficulty Level: Medium

 */
package com.leetcode.slidingwindow.variable;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {
	public static int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int left=0;
        int maxLen = 0;
        for(int i=0;i<s.length();i++)
        {
            while(hs.contains(s.charAt(i)))
            {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(i));
            maxLen = Math.max(maxLen, hs.size());
            
        }
        return maxLen;
    }
	public static void main(String[] args) {
		System.out.println("Max length of substring without repeating characters for the string 'zxyzxyz' is "+lengthOfLongestSubstring("zxyzxyz"));
		System.out.println("Max length of substring without repeating characters for the string 'xxxx' is "+lengthOfLongestSubstring("xxxx"));
		System.out.println("Max length of substring without repeating characters for the string 'pwwkew' is "+lengthOfLongestSubstring("pwwkew"));

	}

}
