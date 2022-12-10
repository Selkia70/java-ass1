package week2.ass;

public class PrimeNum {

	public static void main(String[] args) 
	{
		int n=13;
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("not");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("prime");
		}
		

	}

}
