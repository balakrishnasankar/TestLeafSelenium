package testleaf.week4.day1.assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesleafground {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='j_idt88:new']")).click();
		Set<String> window = driver.getWindowHandles();
		for (String w : window) {
			if (driver.switchTo().window(w).getTitle().contains("Dashboard")) {
				Thread.sleep(4000);
				driver.close();
				break;
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		Set<String> closewindow = driver.getWindowHandles();
		for (String w : closewindow) {
			if (!driver.switchTo().window(w).getTitle().contains("Window")) {
				Thread.sleep(4000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		  wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		 
		Set<String> waitwindow = driver.getWindowHandles();
		for (String w : waitwindow) {
			if (!driver.switchTo().window(w).getTitle().contains("Window")) {
			System.out.println("waitwindow\t"+driver.switchTo().window(w).getTitle());
			Thread.sleep(4000);
			driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		Set<String> noofwindow = driver.getWindowHandles();
		System.out.println("noofwindow\t"+noofwindow.size());
		
	}

}
