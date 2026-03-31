
/*
Leetcode Problem No: 2379

Leetcode Problem Name: Minimum Recolors to Get K Consecutive Black Blocks

Problem Statement: You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. 
The characters 'W' and 'B' denote the colors white and black, respectively.
You are also given an integer k, which is the desired number of consecutive black blocks.
In one operation, you can recolor a white block such that it becomes a black block.
Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.

Problem Type: Fixed Size Sliding Window

Difficulty Level: Easy

Space Complexity: O(1)

Time Complexity: O(n)

 */
public class MinRecolorsForKConsecutiveBlackBox {
	public static int minimumRecolors(String blocks, int k) {
        int recolorOp=0, minOps = Integer.MAX_VALUE;
        for(int i=0;i<blocks.length();i++)
        {
            if(blocks.charAt(i)=='W')
                recolorOp++;
            
            //Remove from the window
            if(i>=k)
            {
                if(blocks.charAt(i-k)=='W')
                    recolorOp--;
            }
            if(i>=k-1)
                minOps = Math.min(recolorOp, minOps);
        }
        return minOps;
    }
	public static void main(String[] args) {
		System.out.println("Minimum recolors required for WBBWWBBWBW are as: "+minimumRecolors("WBBWWBBWBW", 7));
		System.out.println("Minimum recolors required for WBWBBBW as: "+minimumRecolors("WBWBBBW", 2));
	}

}
