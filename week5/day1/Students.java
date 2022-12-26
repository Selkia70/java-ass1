package week5.day1;

public class Students 
{
	public void getStudentInfo(int id) 
	{
		System.out.println(id);
	}
	
		public void getStudentInfo(int id,String name) 
		{
	      System.out.println(id+"  "+name);
		}
		public void getStudentInfo(String email,long phoneNumber) 
		{
	      System.out.println(email+"  "+phoneNumber);
		}
		public static void main(String[] args) 
		{
			Students s1=new Students();
			s1.getStudentInfo(10);
			s1.getStudentInfo(10,"selkia");
			s1.getStudentInfo("selsi043@gmail.com",6382810309l);
			
		}
	}
	

	

