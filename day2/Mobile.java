package week1.day2;

public class Mobile 
{
	String mobileBrandName="Samsung";
	char mobileLogo='S';
	short noOfMobilePiece=2;
	int modelNumber=4;
	long mobileImeiNumber=12345678l;
	float mobilePrice=35000.23f;
	boolean isDamaged=false;
	
	

	public static void main(String[] args) 
	{
		Mobile m1=new Mobile();
		System.out.println("mobileBrandName="+m1.mobileBrandName);
		System.out.println("mobileLogo="+m1.mobileLogo);
		System.out.println("noOfMobilePiece="+m1.noOfMobilePiece);
		System.out.println("modelNumber="+m1.modelNumber);
		System.out.println("mobileImeiNumber="+m1.mobileImeiNumber);
		System.out.println("mobilePrice="+m1.mobilePrice);
		System.out.println("isDamaged="+m1.isDamaged);

	}
}
