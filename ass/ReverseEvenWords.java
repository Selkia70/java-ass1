package week2.ass;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		String text="I am a software tester";
		String[] text1 = text.split(" ");
	    //System.out.print(text1);
	    for(int i=0;i<=text1.length-1;i++)
	{
	    	
		    if(i%2!=0) 
		{
			char [] c1=text1[i].toCharArray();
			for (int j=c1.length-1;j>=0;j--) 
			{
				System.out.print(c1[j]);
			}
			
			
		}
		else 
		{
			System.out.println(text1[i]);
		}
		   
	
}
	}
	}


