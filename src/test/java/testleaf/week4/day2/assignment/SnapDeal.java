package testleaf.week4.day2.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static boolean isCLickable(WebDriver driver, WebElement ele) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]")).click();
		driver.findElement(By.xpath("//a[not(contains(@href,'womens'))]//span[text()='Sports Shoes']")).click();
		List<WebElement> productList = driver.findElements(By.xpath(
				"//*[@class='js-section clearfix dp-widget dp-fired']//div[contains(@class,'product-tuple-listing')]"));
		System.out.println("Total Product Display in Page\t" + productList.size());
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li[@class=\"search-li\"])[1]")).click();
		Thread.sleep(5000);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<Integer> pricesList = new ArrayList<Integer>();
		for (WebElement p : price) {
			String temp = p.getText();
			System.out.println(temp);
			pricesList.add(Integer.parseInt(temp.replace("Rs.", "").replace(",", "").replaceAll("\\s", "")));
		}
		System.out.println(pricesList);
		TreeSet<Integer> set = new TreeSet<Integer>(pricesList);
		if (pricesList.equals(pricesList)) {
			System.out.println("Sorted");
			System.out.println("pricesList" + pricesList);
			System.out.println("Treeset" + set);
		} else {
			System.out.println("not sorted order");
			System.out.println("pricesList" + pricesList);
			System.out.println("Treeset" + set);
		}
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow')]")).click();
		WebElement product = driver.findElement(By.xpath("//img[contains(@class,'product-image')]"));
		Actions action = new Actions(driver);
		action.moveToElement(product).pause(3).click().build().perform();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for (String window : childWindow) {
			Thread.sleep(5000);
			if (driver.switchTo().window(window).getTitle().contains("India")) {
				break;
			}
		}
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[@class='pdpCutPrice ']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='pdpDiscount '] ")).getText());
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snapdeal/show.png");
		FileUtils.copyFile(src, dest);

	}

}
