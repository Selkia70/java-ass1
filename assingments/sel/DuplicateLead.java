package assingments.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("johnselsi043@gmail.com");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//a[text()='19558']")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Duplicate Lead");
		driver.findElement(By.className("smallSubmit")).click();


	}

}
