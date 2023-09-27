package com.leetcode;

public class ZigZagConversion {

	public static String convert(String s, int numRows) {
		String[] strArray = new String[numRows];
	int rowNo = 0;
	String finalStr = "";
	int k = 0;
	if (s == null)
		return "";
	else if (s.length() == 1 || numRows ==1 || numRows> (s.length()))
		return s;
	else if ((s.length() == 2 && numRows ==1) || (s.length()==2 && numRows>2) )
		return s;
	else if(s.length() >=numRows)
	{
		for (int i = 0; i < numRows; i++) {
			strArray[i] = "";
		}
		while (k < s.length()) {
			if (rowNo == -1)
				rowNo = 1;

			if (rowNo < numRows) {
				//System.out.println("***Forward***");
				//System.out.println("rowNo forward initial is::" + rowNo);
				//System.out.println("k initial is::" + k);

				strArray[rowNo] = strArray[rowNo] + (Character.toString(s.charAt(k)));
				System.out.println("strArray for ::" + rowNo + "::is::" + strArray[rowNo]);
				System.out.println("Char at k is::" + s.charAt(k));
				rowNo = rowNo + 1;
				k = k + 1;

				// System.out.println("rowNo forward updated is::"+rowNo);
				// System.out.println("k forward updated is::"+k);
				// System.out.println("***Forward ends***");
			}
			if (rowNo == numRows - 1 && k < s.length()) {

				strArray[rowNo] = strArray[rowNo].concat(Character.toString(s.charAt(k)));
				System.out.println("strArray for ::" + rowNo + "::is::" + strArray[rowNo]);
				System.out.println("Char at k is::" + s.charAt(k));
				System.out.println("***Reverse***");

				// System.out.println("rowNo reverse is::"+rowNo);
				rowNo = rowNo - 1;
				k = k + 1;
				while (rowNo >= 0 && k < s.length()) {

					//System.out.println("rowNo reverse initial is::" + rowNo);
					//System.out.println("k reverse initial is::" + k);
					strArray[rowNo] = strArray[rowNo].concat(Character.toString(s.charAt(k)));
					System.out.println("strArray for ::" + rowNo + "::is::" + strArray[rowNo]);
					System.out.println("Char at k is::" + s.charAt(k));
					rowNo = rowNo - 1;
					k = k + 1;
				}
				System.out.println("***Reverse ends ***");
			}
		}
		for (int i = 0; i < numRows; i++) {
			System.out.println("strArray for ::" + i + "::is::" + strArray[i]);
			finalStr = finalStr.concat(strArray[i]);
		}
		System.out.println("finalStr is::" + finalStr);
		return finalStr;
	}
	return finalStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convert("ABCDE", 2);

	}

}
