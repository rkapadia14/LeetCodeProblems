import java.util.Stack;

//Leetcode Problem No: 71
//Leetcode Problem Name: Simplify Path
//Problem Statement: You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.
//The simplified canonical path should follow these rules:
//The path must start with a single slash '/'.
//Directories within the path must be separated by exactly one slash '/'.
//The path must not end with a slash '/', unless it is the root directory.
//The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
//Difficulty Level: Medium
//Technique Used: Stacks
//Time Complexity: O(n)
//Space Complexity: O(n)
public class SimplifyPath{
    public static String simplifyPath(String path) {
        String[] values = path.split("/");
        Stack<String> stack = new Stack<>();
        StringBuilder sb= new StringBuilder();
        for (String value : values) {
                if(!value.equals("")){
                    if(value.equals("..") && !stack.isEmpty())
                        stack.pop();
                    else if(!value.equals("..") && !value.equals("."))
                        stack.push(value);
                }
                   
        }
       for (String dir : stack) {
			sb.append("/").append(dir);
		}
        return sb.toString().isEmpty()? "/" :sb.toString();

    }   
    public static void main(String[] args){
        String path = "/home/user/Documents/../Pictures";
        System.out.println("Original path is-"+ path);
        System.out.println("Simplified path is-"+ simplifyPath(path));
    }

}