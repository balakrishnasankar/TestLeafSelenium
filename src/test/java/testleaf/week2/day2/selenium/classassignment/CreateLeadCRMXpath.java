package testleaf.week2.day2.selenium.classassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadCRMXpath {

	public ChromeDriver createLead(String leadName) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),CRM/SFA)]")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("BTLead"+leadName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("BTLeadFN"+leadName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("BTLeadLN"+leadName);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("BTLeadFNLocal"+leadName);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BTLeaddepartmentName"+leadName);
		driver.findElement(By.id("createLeadForm_description")).sendKeys("BTLeaddescriptionName"+leadName);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("BTLeadLN01@gmail.com");		
		WebElement StateProvinceDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateProvince = new  Select(StateProvinceDropDown);
		stateProvince.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println(driver.getTitle());
		return driver;
	}

}
