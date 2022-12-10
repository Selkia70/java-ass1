package week2.ass;

import java.util.Arrays;

public class SecondLargestnum {

	public static void main(String[] args) 
	{
		int num[]= {3,2,11,4,6,7};
		
		Arrays.sort(num);
		
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
System.out.println("sec Largest num "+ num[num.length-2]);
	}
	}


