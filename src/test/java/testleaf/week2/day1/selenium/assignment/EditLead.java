package testleaf.week2.day1.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public ChromeDriver editLead(String leadName) {
		CreateLeadCRM lead = new CreateLeadCRM();
		ChromeDriver driver = lead.createLead(leadName);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("BTLeadimportantNoteUpdated"+leadName);
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());	
		return driver;
	}

}
