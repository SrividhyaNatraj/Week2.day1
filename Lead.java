package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NSV");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vidhya");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("selenium");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium testing for quality analysis");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("srividhyanatraj@gmail.com");
		WebElement drop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select options=new Select(drop);
		options.selectByValue("NY");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Precheck before create a lead");
		driver.findElement(By.name("submitButton")).click();
				
	}
	
		
		
	}

