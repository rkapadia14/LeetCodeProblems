import java.util.Stack;

/*
LeetCode Problem: 150

Problem Name: Evaluate Reverse Polish Notation

Problem Statement: You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
Evaluate the expression. Return an integer that represents the value of the expression.
Note that: The valid operators are '+', '-', '*', and '/'.

Difficulty: Medium 
*/
public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
           if(tokens[i].equals("*"))
            {
                int val = stack.pop() * stack.pop();
                stack.push(val);
            }
            else if(tokens[i].equals("/"))
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                int val = val2/val1;
                stack.push(val);
            }
            else if(tokens[i].equals("+"))
            {
                int val = stack.pop() + stack.pop();
                stack.push(val);
            }
            else if(tokens[i].equals("-"))
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                int val = val2-val1;
                stack.push(val);
            }
            else
                stack.push(Integer.parseInt(tokens[i]));
            
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println("Value of the reverse polish expression is:"+evalRPN(tokens));
    }
}
