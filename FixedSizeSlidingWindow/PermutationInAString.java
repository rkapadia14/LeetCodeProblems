import java.util.*;

/*
Leetcode Problem No: 567

Leetcode Problem Name: Permutation in String

Problem Statement: Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2.

Problem Type: Fixed Size Sliding Window

Space Complexity: O(1)

Time Complexity: O(n)

 */

class PermutationInAString {
	public static boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length())
			return false;
		int[] s1Count = new int[26];
		int[] s2Count = new int[26];
		for (char ch : s1.toCharArray()) {
			s1Count[ch - 'a']++;
		}
		for (int i = 0; i < s2.length(); i++) {
			s2Count[s2.charAt(i) - 'a']++;
			if (i >= s1.length())
				s2Count[s2.charAt(i - s1.length()) - 'a']--;
			if (matchArray(s1Count, s2Count))
				return true;
		}
		return false;
	}

	public static boolean matchArray(int[] s1arr, int[] s2arr) {
		for (int i = 0; i < 26; i++) {
			if (s1arr[i] != s2arr[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkInclusion("ab", "eidbaooo"));
		System.out.println(checkInclusion("ab", "eidboaoo"));
	}
}
