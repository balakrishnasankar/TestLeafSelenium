package testleaf.week4.day1.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmzonSearchMobile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/Amzonphone1.png");
		FileUtils.copyFile(src, dest);

		/*
		 * 
		 * System.out.println("Mobile Price 1st Item\t" + driver.findElement(By.xpath(
		 * "(//div[@class='a-section a-spacing-small a-spacing-top-small'])[2]//span[@class='a-price-whole']"
		 * )) .getText()); System.out.println("No of Customer Review  1st Item\t" +
		 * driver.findElement(By.xpath(
		 * "(//div[@class='a-section a-spacing-small a-spacing-top-small'])[2]//span[contains(@class,'a-size-base puis-light-weight-text')]"
		 * )) .getText());
		 * driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click(); String
		 * parent = driver.getWindowHandle(); Set<String> window =
		 * driver.getWindowHandles(); for (String w : window) { if
		 * (driver.switchTo().window(w).getTitle().contains("Electronics")) { File src =
		 * driver.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("./screenshot/Amzonphone.png"); FileUtils.copyFile(src, dest);
		 * driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		 * driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']"
		 * )).click(); String prices1 = driver .findElement(By.xpath(
		 * "//div[contains(@class,'sc-list-item-content')]//span[contains(@class,'sc-price')]"
		 * )) .getText(); String prices2 = driver.findElement(By.xpath(
		 * "//div[contains(@class,'sc-buy-box-group')]//span[contains(@class,'sc-white-space-nowrap')]"
		 * )) .getText(); if (prices1.equalsIgnoreCase(prices2)) {
		 * System.out.println("Prices Matched\t" + prices1 + "\t" + prices2); } else {
		 * System.out.println("Prices Not Matched\t" + prices1 + "\t" + prices2); }
		 * break; }
		 * 
		 * }
		 */

	}

}
