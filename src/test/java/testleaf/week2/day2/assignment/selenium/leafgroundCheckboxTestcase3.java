package testleaf.week2.day2.assignment.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafgroundCheckboxTestcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all')]"))
		.click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all')]"))
		.click();
		System.out.println(driver.findElement(By.xpath("//div[@class='ui-growl-item']")).getText());
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all')]"))
		.click();
		System.out.println(driver.findElement(By.xpath("//div[@class='ui-growl-item']")).getText());
		
		
		driver.findElement(By.xpath("//table[@id='j_idt87:basic']//label[text()='Java']/preceding-sibling::div"))
		.click();
		driver.findElement(By.xpath("//table[@id='j_idt87:basic']//label[text()='Python']/preceding-sibling::div"))
		.click();

		//Tri State Checkbox issue need to check
		/*
		 * driver.findElement(By.
		 * xpath("//div[@id='j_idt87:ajaxTriState']//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')]"
		 * )).click(); System.out.println("2"+driver.findElement(By.xpath(
		 * "//div[@class='ui-growl-message']//span")).getText());
		 * System.out.println("2"+driver.findElement(By.xpath("//div[@role='alert']")).
		 * getText());
		 */
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"))
		.click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isSelected());
		
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']"))
		.click();
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//label[text()='Miami']"))
		.click();
		
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//label[text()='Berlin']"))
		.click();
		
		System.out.println(driver.findElement(By.xpath("//ul[@data-label='Cities']")).getText());
		
	
	
	}

}
