package testleaf.week2.day1.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public ChromeDriver duplicateLead(String leadName,String newLeadName ) {
		
		CreateLeadCRM lead = new CreateLeadCRM();
		ChromeDriver driver = lead.createLead(leadName);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BTLead"+newLeadName);
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("BTLeadFN"+newLeadName);
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		return driver;
	}
	
}
