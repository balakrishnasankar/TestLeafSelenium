package testleaf.week4.day1.classassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAndFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert =driver.switchTo().alert();
		alert.sendKeys("Bala");
		alert.accept();
		String text =driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(text.contains("Bala")) {
			System.out.println("ALert Send Key Works\t" +text);
		}else {
			System.out.println("ALert Send Key Not Works\t"+text);
		}
		

		
	}

}
