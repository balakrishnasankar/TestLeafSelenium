package testleaf.week2.day1.selenium.classassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BTLead01");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("BTLeadFN01");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("BTLeadLN01");
		WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown = new  Select(sourceDropDown);
		dropDown.selectByValue("LEAD_CONFERENCE");
		// driver.findElement(By.name("submitButton")).click();

	}

}
