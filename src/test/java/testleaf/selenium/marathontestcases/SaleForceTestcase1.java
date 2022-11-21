package testleaf.selenium.marathontestcases;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaleForceTestcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		WebDriverManager.chromedriver().setup();
		
		/*
		 * // Create object of HashMap Class Map<String, Object> prefs = new
		 * HashMap<String, Object>();
		 * 
		 * // Set the notification setting it will override the default setting
		 * prefs.put("profile.default_content_setting_values.notifications", 2);
		 * 
		 * // Create object of ChromeOption class ChromeOptions options = new
		 * ChromeOptions();
		 * 
		 * // Set the experimental option options.setExperimentalOption("prefs", prefs);
		 */
		
	
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		driver.findElement(By.xpath("//span[text()='Opportunities']/ancestor::a")).click();
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("11/17/2022");
		
		driver.findElement(By.xpath("//label[text()='Stage']/following-sibling::div[1]")).sendKeys("Needs Analysis");
		
		
		
		
		
		
		
	}

}
