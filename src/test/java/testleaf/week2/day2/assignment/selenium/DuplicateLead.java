package testleaf.week2.day2.assignment.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String leadName ="4032";
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BTLead"+leadName);
		String companyName =driver.findElement(By.id("createLeadForm_companyName")).getText();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("BTLeadFN"+leadName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("BTLeadLN"+leadName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9000000001");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sbk@gmail.com");
		driver.findElement(By.name("submitButton")).click();		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sbk@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String leadId = driver.findElement(By.xpath(
				"(//div[text()='9000000001']/preceding::td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])//a[1]"))
				.getText();
		driver.findElement(By.xpath(
				"(//div[text()='9000000001']/preceding::td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])//a[1]"))
				.click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String headerLeadInfor = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		if(headerLeadInfor.equalsIgnoreCase("Duplicate Lead")) {
			System.out.println("Duplicate Lead PASSED");
		}else {
			System.out.println("FAILED");
		}
		driver.findElement(By.name("submitButton")).click();
		String duplicateLead = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if(duplicateLead.contains(companyName)) {
			System.out.println("Company Name PASSED");
		}else {
			System.out.println("FAILED");
		}
		
	}

}
