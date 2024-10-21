//Leetcode Problem No: 125
//Difficulty Level: Easy
//Problem Statement: A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. 
//Alphanumeric characters include letters and numbers. Given a string s, return true if it is a palindrome, or false otherwise.

class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s.length()==1)
            return true;
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        
        while(i<=j){
            if(!Character.isLetterOrDigit(s.charAt(i)))
                i++; 
            else if(!Character.isLetterOrDigit(s.charAt(j)))
               j--;    
            else 
            {
                if(s.charAt(i)!=s.charAt(j))
                    return false;
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
        System.out.println("The string "+ s + "is a valid palindrome? Answer: " + isPalindrome(s));
    }
}