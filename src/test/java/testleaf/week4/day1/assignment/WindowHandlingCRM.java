package testleaf.week4.day1.assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingCRM {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		String parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		for (String s : windowhandles) {
			if (driver.switchTo().window(s).getTitle().contains("Find Contacts")) {
				System.out.println("1");
				Thread.sleep(6000);
				Actions actions = new Actions(driver);			
				String elementLocator = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tr//td)[1]")).getText();				
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(elementLocator);
				driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[text()='"+elementLocator+"']")).click();
				break;
			}
		}
		driver.switchTo().window(parent);
		String parent1 = driver.getWindowHandle();
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Thread.sleep(4000);
		Set<String> windowhandles1 = driver.getWindowHandles();
		for (String s : windowhandles1) {
			if (driver.switchTo().window(s).getTitle().contains("Find Contacts")) {
				System.out.println("2");
				Thread.sleep(6000);		
				String elementLocator = driver.findElement(By.xpath("(//table[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//tr)[2]//td[1]")).getText();				
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(elementLocator);
				driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[text()='"+elementLocator+"']")).click();
				break;
			}
		}
		
		driver.switchTo().window(parent1);
		driver.findElement(By.xpath("(//a[text()='Merge']")).click();
		

	}

}
