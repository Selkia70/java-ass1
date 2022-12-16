package todayTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bank {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Selkia");
		driver.findElement(By.id("middleName")).sendKeys("J");
		driver.findElement(By.id("lastName")).sendKeys("John");
		driver.findElement(By.id("age")).sendKeys("10/30/2000");
		driver.findElement(By.id("username")).sendKeys("selkia");
		driver.findElement(By.id("email")).sendKeys("selkiajohn123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("selkia70!");
		WebElement findElement = driver.findElement(By.id("sex"));
		Select drop=new Select(findElement);
		drop.selectByValue("female");
		WebElement findElement2 = driver.findElement(By.id("title"));
		Select drop1=new Select(findElement2);
		drop1.selectByVisibleText("Ms");
		WebElement findElement3 = driver.findElement(By.id("employmentStatus"));
		Select drop2=new Select(findElement3);
		drop2.selectByVisibleText("Full-time");
		WebElement findElement4 = driver.findElement(By.id("maritalStatus"));
		Select drop3=new Select(findElement4);
		drop3.selectByVisibleText("Single");
		
		
		

		

		



		

		


	}

}
