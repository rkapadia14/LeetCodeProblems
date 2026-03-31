/*
Leetcode Problem No: 1456

Leetcode Problem Name: Maximum Number of Vowels in a Substring of Given Length

Problem Statement: Given a string s and an integer k, 
return the maximum number of vowel letters in any substring of s with length k.

Problem Type: Fixed Size Sliding Window

Space Complexity: O(1)

Time Complexity: O(n)

 */

public class MaximumNoOfVowelsInSubstring {
	
	public static int maxVowels(String s, int k) {
        int count=0, maxCount = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
            if(i>=k)
            {
                if(s.charAt(i-k) == 'a' || s.charAt(i-k) == 'e' 
                || s.charAt(i-k) == 'i' || s.charAt(i-k) == 'o' 
                || s.charAt(i-k) == 'u')
                    count--;
            }
            // update max ONLY when window size reached
            if(i >= k - 1) {
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
        
    }

	public static void main(String[] args) {
		System.out.println("Maximum No of Vowels in the string is: "+ maxVowels("abciiidef", 3));
		System.out.println("Maximum No of Vowels in the string is: "+ maxVowels("aeiou", 2));

	}

}
