package testleaf.week2.day2.assignment.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String leadName ="1013";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		String tempName="BTLead"+leadName;
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(tempName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("BTLeadFN"+leadName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("BTLeadLN"+leadName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9000000001");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sbk@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='firstName']")).sendKeys("BTLeadFN"+leadName);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String leadId = driver.findElement(By.xpath(
				"(//a[text()='"+tempName+"']/preceding::td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])//a[1]"))
				.getText();
		driver.findElement(By.xpath(
				"(//a[text()='"+tempName+"']/preceding::td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])//a[1]"))
				.click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		String updatedTemp="BTLeadCompanyUpdated"+leadName;
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updatedTemp);
		driver.findElement(By.className("smallSubmit")).click();
		String updatedCompanyNameActual = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if(updatedCompanyNameActual.contains(updatedTemp)) {
			System.out.println("Company Name PASSED");
		}else {
			System.out.println("FAILED");
		}
		
		
	}

}
