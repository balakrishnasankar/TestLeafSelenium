package testleaf.week2.day2.assignment.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	
	public static void SelectDropDown(WebDriver driver ,WebElement ele ,String value) {
		Select dropDown = new Select(ele);
		dropDown.selectByValue(value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("BTTest");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("BTTest");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("BTTest");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("BTTest@1234");
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Facebook.SelectDropDown(driver, day, "16");
		Facebook.SelectDropDown(driver, month, "6");
		Facebook.SelectDropDown(driver, year, "1989");
	}

}
