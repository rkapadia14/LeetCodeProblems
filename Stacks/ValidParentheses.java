import java.util.Stack;

/*
LeetCode Problem: 20

Problem Name: ValidParentheses

Problem Statement: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if: i) Open brackets must be closed by the same type of brackets, ii)  Open brackets must be closed in the correct order.
iii) Every close bracket has a corresponding open bracket of the same type.

Difficulty: Easy 
*/
class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            else if(stack.size()>0 && ((stack.peek() == '(' && ch == ')') || 
                (stack.peek() == '[' && ch == ']') ||
                (stack.peek() == '{' && ch == '}')))
                {
                    stack.pop();
                }
            else
                stack.push(ch);
                
            
        }
        if(stack.isEmpty())
            return true;
        return false;
        
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(" String s:" + s + " has valid parantheses: " + isValid(s));
    }
}