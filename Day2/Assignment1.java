package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();	
		//Enter UserName and Password Using Id Locator
		//credential
		//Username:DemoCsr
		//Password:crmsfa
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		//Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Pziser");
		//Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
		// Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		// Enter your mail-id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		//phone number 
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9840223366");
		//Click on create Lead Button Using name Locator
		driver.findElement(By.name("submitButton")).click();
		
    

		//driver.close();
		
	}

}
