package testleaf.week4.day1.classassignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		Set<String> window = driver.getWindowHandles();
		for (String w : window) {
			String title = driver.switchTo().window(w).getTitle();
			if (title.contains("Flight")) {
				break;
			}
		}
		driver.switchTo().window(parentWindow);
		driver.close();
	
	}

}
