package testleaf.week3.day2.selenium.classassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonMobilePrice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER);
		Thread.sleep(7000);
		List<WebElement> mobileList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> mobilePrice = new ArrayList<Integer>();
		for (WebElement m : mobileList) {
			String price = m.getText().replace(",","").replace("₹","");
			if (!price.trim().isEmpty() && price!=null && price.length()>0) {
				System.out.println(price);
				int p = Integer.parseInt(price);
				mobilePrice.add(p);
			}
		}
		Collections.sort(mobilePrice);
		System.out.println("least Mobile Prices\t" + mobilePrice.get(0));

	}
}
