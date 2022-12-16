package assingments.sel;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("selkia");
		
		//driver.findElement(By.id("ext-gen248")).sendKeys("Selkia");
		driver.findElement(By.id("ext-gen334")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		System.out.println("The title is:"+driver.getTitle());

	    driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Tata Elxsi");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();




		

		

	}

}
