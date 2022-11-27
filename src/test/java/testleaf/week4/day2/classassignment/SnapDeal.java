package testleaf.week4.day2.classassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions action = new Actions(driver);
		action.moveToElement(driver
				.findElement(By.xpath("(//a[@class='menuLinks leftCategoriesProduct ']//span[@class='catText'])[1]")))
				.click(driver.findElement(By.xpath("//div[@id='category1Data']//span[text()='Shirts']"))).perform();
		Thread.sleep(4000);
		Actions action1 = new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath("(//img[@class='product-image '])[1]")))
				.click(driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"))).perform();
	}

}
