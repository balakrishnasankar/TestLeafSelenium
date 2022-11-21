package testleaf.week2.day2.assignment.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BTLead021");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("BTLeadFN021");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("BTLeadLN01");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9000000001");
		driver.findElement(By.name("submitButton")).click();		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9000000001");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String leadId = driver.findElement(By.xpath(
				"(//div[text()='9000000001']/preceding::td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])//a[1]"))
				.getText();
		driver.findElement(By.xpath(
				"(//div[text()='9000000001']/preceding::td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])//a[1]"))
				.click();
		driver.findElement(By.linkText("Delete")).click();

		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String displayMsg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(displayMsg.equalsIgnoreCase("No records to display")) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
		}

	}

}
