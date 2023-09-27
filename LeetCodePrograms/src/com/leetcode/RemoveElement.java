package com.leetcode;

import java.util.HashMap;

public class RemoveElement {

	public static boolean isIsomorphic(String s, String t) {
       boolean result = true;
       int i =0;
       HashMap<Character, Character> uniqueCharacters = new HashMap<Character, Character>();
       while(i < s.length())
       {
    	   if(uniqueCharacters.containsKey(s.charAt(i))) 
           {
        	  System.out.println("Found the element::"+s.charAt(i));
        	  System.out.println("Value for the element::"+s.charAt(i)+"::is::"+uniqueCharacters.get(s.charAt(i)));
               if(uniqueCharacters.get(s.charAt(i)) != t.charAt(i))
               {
                   result = false;
                   break;
                }
          }
          else if(uniqueCharacters.containsKey(s.charAt(i)) == false && uniqueCharacters.containsValue(t.charAt(i)))
          {
        	   result = false;
               break;
          }
         else 
         {
             uniqueCharacters.put(s.charAt(i), t.charAt(i));
         }
         i++;

       }
       return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isIsomorphic("paper", "title");
	}
}
