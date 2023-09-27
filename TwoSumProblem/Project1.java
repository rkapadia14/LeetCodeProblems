import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Project1 {
	
	/*
	 * Method for computing maximum subset Product using Brute Force
	 */
	public static void subsetProductBruteForce(int[] nums, int maxProduct)
	{
		int finalProduct = 0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(j==i)
					continue;
				else
				{
					int product = nums[i]* nums[j];
					if(product <=maxProduct)
						finalProduct =  Math.max(product, finalProduct);
				}
			}
		}
		System.out.println(finalProduct);
	}
	/*
	 * Method for computing maximum subset Product using Greedy Approach
	 */
	public static void subsetProductGreedy(int[] nums, int maxProduct)
	{
		int greedyProduct =1;
		nums = IntStream.of(nums)
		        .boxed()
		        .sorted(Comparator.reverseOrder())
		        .mapToInt(i -> i)
		        .toArray();
		
		for(int j=0;j<nums.length;j++)
			greedyProduct = (greedyProduct*nums[j]<=maxProduct)?(greedyProduct*nums[j]):greedyProduct;
		
		System.out.println(greedyProduct);
	}
	public static void main(String args[]) throws IOException
	{
		//Code for reading input file
		File file = new File("input.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String line;
		StringBuffer sb = new StringBuffer();
		while((line = br.readLine()) != null){
		     sb.append(line+" ");
		}
		br.close();
		String[] input = sb.toString().split(" ");
		//Assuming 1st number is the target
        //Assuming 2nd number is the size of the input
        //Assuming rest of the numbers are the set of integers
		int target = Integer.parseInt(input[0]);	
		int size= Integer.parseInt(input[1]);
		int[] nums = new int[size];
		List<Integer> ls = new ArrayList<Integer>();
       // System.out.println("=====Input=====");
        //System.out.println("Target="+target);
        //System.out.println("Input Size="+size);
		for(int k=2;k<input.length;k++)
        {
            //System.out.println(input[k]);
			ls.add(Integer.parseInt(input[k]));
		}
		nums = ls.stream().mapToInt(i->i).toArray();
		

		//System.out.println("====Output====");

		subsetProductBruteForce(nums, target);
		subsetProductGreedy(nums, target);
	}
}
