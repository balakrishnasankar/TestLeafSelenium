package testleaf.week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// 1st frame
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("Test");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent();
		if (driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).isDisplayed()) {
			System.out.println("CHecked in Main Page");
		}
		driver.switchTo().frame("frame2");
		Select select = new Select(driver.findElement(By.xpath("//select[@id='animals']")));
		select.selectByValue("avatar");
	}
}
