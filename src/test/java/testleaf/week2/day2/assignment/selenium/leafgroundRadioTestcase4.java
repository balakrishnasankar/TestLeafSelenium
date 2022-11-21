package testleaf.week2.day2.assignment.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafgroundRadioTestcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']//label[text()='Safari']/preceding-sibling::div"))
				.click();
		driver.findElement(By.xpath("//div[@id='j_idt87:city2']//label[text()='Chennai']/preceding-sibling::div"))
				.click();
		driver.findElement(By.xpath("//div[@id='j_idt87:city2']//label[text()='Chennai']/preceding-sibling::div"))
				.click();
		List<WebElement> r = driver.findElements(By.xpath("//input[@name='j_idt87:console2']"));
		for (WebElement s : r) {
			if (s.getAttribute("checked") != null) {
				System.out.println(
						s.getAttribute("checked").toString() + s.getText() + s.getAttribute("value").toString());
			}
		}
		List<WebElement> r2 = driver.findElements(By.xpath("//div[@id='j_idt87:age']//input"));

		for (int i = 0; i < r2.size(); i++) {
			WebElement s2 = r2.get(i);
			if (!s2.isSelected()) {
				int index = i + 1;
				driver.findElement(By.xpath(
						"(//div[@id='j_idt87:age']//div[contains(@class,'ui-radiobutton-box ui-widget ui-corner-all ui-state-default')])["
								+ index + "]"))
						.click();
				break;
			}
		}

	}

}
