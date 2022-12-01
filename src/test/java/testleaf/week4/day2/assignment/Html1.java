package testleaf.week4.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> row = driver.findElements(By.xpath("//div[@class='render']//tbody//tr"));
		List<WebElement> col = driver.findElements(By.xpath("//div[@class='render']//tbody//tr[1]//td"));

		System.out.println("row\t" + row.size());
		System.out.println("col\t" + col.size());

	}

}
