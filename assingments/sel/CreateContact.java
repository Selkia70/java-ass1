package assingments.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("selkia");
		driver.findElement(By.id("lastNameField")).sendKeys("J");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sel");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("sia");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Tester");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Iam a software Tester");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("johnselsi043@gmail.com");
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown=new Select(findElement);
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Iam a software tester");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		

	}

}
