package todayTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Selkia");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("J");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("johnselsi043@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Selsia70!");
		WebElement findElement = driver.findElement(By.id("day"));
		Select drop=new Select(findElement);
		drop.selectByIndex(2);
		WebElement findElement2=driver.findElement(By.id("month"));
		Select drop1=new Select(findElement2);
		drop1.selectByValue("6");
		WebElement findElement3 = driver.findElement(By.id("year"));
		Select drop3=new Select(findElement3);
		drop3.selectByVisibleText("2000");
		//driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	driver.findElement(By.name("sex")).click();
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("johnselsi043@gmail.com");
	//driver.close();
	}

}
