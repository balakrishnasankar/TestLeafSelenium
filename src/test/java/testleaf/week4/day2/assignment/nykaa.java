package testleaf.week4.day2.assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// driver.findElement(By.xpath("//div[@class='pdpCutPrice ']")
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		WebElement brandSearchBox = driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']"));
		Actions action = new Actions(driver);
		action.moveToElement(brand).pause(3).build().perform();
		brandSearchBox.sendKeys("L'Oreal Paris", Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		driver.findElement(By.xpath("(//div[@class='productWrapper css-xin9gt'])[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();

		for (String w : childWindow) {
			if (driver.switchTo().window(w).getTitle().contains("Oreal Paris")) {
				break;
			}
		}
		String prices = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='css-acpm4k']")));
		String grandTotal = driver.findElement(By.xpath("(//p[text()='You Pay']/parent::div)//following::p[1]")).getText();
		String totalPrice = grandTotal.substring(1, grandTotal.length());
		System.out.println("totalPrice\t" + totalPrice);
		driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("//div[@class='css-1801j3v eqr1d9n11']")).click();
		String expectedPrice = driver.findElement(By.xpath("//p[@class='css-5t7v9l eka6zu20']")).getText();
		String expectedPrice1 = expectedPrice.substring(1, expectedPrice.length());
		if (totalPrice.equalsIgnoreCase(expectedPrice1)) {
			System.out.println("Prices Matched");
			System.out.println("totalPrice\t" + totalPrice);
			System.out.println("expectedPrice1\t" + expectedPrice1);
		} else {
			System.out.println("Prices Not Matched");
			System.out.println("totalPrice\t" + totalPrice);
			System.out.println("expectedPrice1\t" + expectedPrice1);
		}

	}

}
