package week2.ass;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String str1="stops";
		String str2="posts";
		if(str1.length()==str2.length())
		{
			char[] st=str1.toCharArray();
			char[] st1=str2.toCharArray();
			Arrays.sort(st);
			Arrays.sort(st1);
			System.out.println(st);
			System.out.println(st1);
			boolean result=Arrays.equals(st,st1 );
			if(result) {
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not Anagram");

			}

			
		}

	}

}
