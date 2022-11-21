package testleaf.week2.day2.assignment.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

				String leadName="BTContact01";
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.linkText("Create Contact")).click();
	
				driver.findElement(By.id("firstNameField")).sendKeys("BTLeadFN"+leadName);
				driver.findElement(By.id("lastNameField")).sendKeys("BTLeadLN"+leadName);
				driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("BTLeadFNLocal"+leadName);
				driver.findElement(By.id("createContactForm_departmentName")).sendKeys("BTLeaddepartmentName"+leadName);
				driver.findElement(By.id("createContactForm_description")).sendKeys("BTLeaddescriptionName"+leadName);
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("BTLeadLN01@gmail.com");	
				WebElement StateProvinceDropDown = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
				Select stateProvince = new  Select(StateProvinceDropDown);
				stateProvince.selectByVisibleText("United States");
				driver.findElement(By.name("submitButton")).click();
				driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.id("updateContactForm_departmentName")).clear();
				driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("BTLeadimportantNoteUpdated"+leadName);
				driver.findElement(By.className("smallSubmit")).click();
				System.out.println(driver.getTitle());
				
				
	}

}
