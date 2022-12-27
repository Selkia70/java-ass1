package week5.day2;

public class Automation extends MultipleLangauge implements Language, TestTool 
{

	public static void main(String[] args) 
	{
		Automation au=new Automation();
		au.Java();
		au.Selenium();
		au.python();
		//au.ruby();
		

	}

	@Override
	public void Java() {
		System.out.println("java");
		
	}

	@Override
	public void Selenium() 
	{
		System.out.println("selenium");

		
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
	}

	
	

	

}
