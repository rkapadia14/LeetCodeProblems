package com.leetcode;

import java.util.HashMap;

public class IntegerToRomanTest {

	public static String intToRoman(int num) {
		HashMap<Integer, String> mapDigits = new HashMap<Integer, String>();
		mapDigits.put(0, "");
		mapDigits.put(1, "I");
		//mapDigits.put(2, "II");
		//mapDigits.put(3, "III");
		mapDigits.put(4, "IV");
		mapDigits.put(5, "V");
		//mapDigits.put(6, "VI");
		//mapDigits.put(7, "VII");
		//mapDigits.put(8, "VIII");
		mapDigits.put(9, "IX");
		mapDigits.put(10, "X");
		mapDigits.put(40, "XL");
		mapDigits.put(50, "L");
		mapDigits.put(90, "XC");
		mapDigits.put(100, "C");
		mapDigits.put(400, "CD");
		mapDigits.put(500, "D");
		mapDigits.put(100, "C");
		mapDigits.put(900, "CM");
		mapDigits.put(1000, "M");
		String strRoman = "";

		int number = num;
		int count = 0;
		int digit;
		String finalStr = "";
		
		while(number>0)
		{
			count = count + 1;
			digit = number % 10;
			
			if(count ==1)
			{
				if(digit == 4)
					strRoman = mapDigits.get(digit);
				else if(digit ==5)
					strRoman = mapDigits.get(digit);
				else if(digit ==9)
					strRoman = mapDigits.get(digit);
				else if(digit >=1 && digit <4)
				{
					for(int i =0; i<digit;i++)
						strRoman = strRoman + mapDigits.get(1);
				}
				else if(digit >5 && digit <10)
				{
					strRoman = "V";
					for(int i =0; i<digit-5;i++)
						strRoman = strRoman + mapDigits.get(1);
				}
				finalStr = strRoman;
			}
			else if(count ==2)
			{
				
				System.out.println("Hellooo1111");
				strRoman = "";
				int num1 = digit *10;
				System.out.println("Hellooo:::num1:::"+num1);
				//strRoman = mapDigits.get(10);
				if(num1 == 40)
				{
					System.out.println("Hellooo ==40");
					strRoman = mapDigits.get(num1);
					
				}else if(num1 == 90)
				{
					System.out.println("Hellooo ==90");
					strRoman = mapDigits.get(num1);
				}
				else if(num1 ==50 )
				{
					System.out.println("Hellooo ==50");
					strRoman = mapDigits.get(num1);
				}else if(num1 >= 10 && num1<40 )
				{
					
					System.out.println("Hellooo >=10 and <40:::strRoman::"+strRoman);
					for(int i =0; i<digit; i++)
						strRoman = strRoman + mapDigits.get(10);
				}
				 
				else if(num1 >= 50 && num1<100 )
				{
					System.out.println("Hellooo");
					strRoman = "L";
					for(int i =0; i<(digit-5); i++)
						strRoman = strRoman + mapDigits.get(10);
				}
				System.out.println("After count == 2:::"+strRoman);
				finalStr = strRoman + finalStr; 
			}
			else if(count ==3)
			{
				
				System.out.println("Hellooo333333");
				strRoman = "";
				int num1 = digit *100;
				System.out.println("Hellooo:::num1:::"+num1);
				//strRoman = mapDigits.get(10);
				if(num1 == 400)
				{
					System.out.println("Hellooo ==40");
					strRoman = mapDigits.get(num1);
					
				}else if(num1 == 900)
				{
					System.out.println("Hellooo ==90");
					strRoman = mapDigits.get(num1);
				}
				else if(num1 ==50 )
				{
					System.out.println("Hellooo ==50");
					strRoman = mapDigits.get(num1);
				}else if(num1 >= 100 && num1<400 )
				{
					
					System.out.println("Hellooo >=10 and <40:::strRoman::"+strRoman);
					for(int i =0; i<digit; i++)
						strRoman = strRoman + mapDigits.get(100);
				}
				 
				else if(num1 >= 500 && num1<1000 )
				{
					System.out.println("Hellooo");
					strRoman = "D";
					for(int i =0; i<(digit-5); i++)
						strRoman = strRoman + mapDigits.get(100);
				}
				System.out.println("After count == 2:::"+strRoman);
				finalStr = strRoman + finalStr; 
			}
			else if(count ==4)
			{
				
				System.out.println("Helloooo4444");
				strRoman = "";
				int num1 = digit *1000;
				System.out.println("Hellooo:::num1:::"+num1);
				//strRoman = mapDigits.get(10);
				if(num1 >= 1000 && num1<4000 )
				{
					
					System.out.println("Hellooo >=1000 and <4000:::strRoman::"+strRoman);
					for(int i =0; i<digit; i++)
						strRoman = strRoman + mapDigits.get(1000);
				}
				 
				
				System.out.println("After count == 2:::"+strRoman);
				finalStr = strRoman + finalStr; 
			}
			
			number = number/10;
		}
		
		
		return finalStr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String romanStr = intToRoman(1994);
		System.out.println(romanStr);

	}

}
