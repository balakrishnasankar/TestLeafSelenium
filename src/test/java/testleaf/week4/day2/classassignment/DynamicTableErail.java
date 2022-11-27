package testleaf.week4.day2.classassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTableErail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS", Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("CBE", Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		List<WebElement> row = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
		System.out.println("row\t" + row.size());
		List<WebElement> col = driver.findElements(By.xpath(
				"//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[" + 2 + "]//td"));
		System.out.println("col\t" + col.size());
		int totalRow = row.size();
		int totalCol = col.size();
		Thread.sleep(8000);
		List<WebElement> trainName = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]//a"));
		List<String> trainList = new ArrayList<String>();
		for (WebElement e : trainName) {
			trainList.add(e.getText());
		}
		System.out.println(trainList.size());
		Set<String> setList = new HashSet<String>(trainList);
		System.out.println(setList.size());
		if (trainList.size() == setList.size()) {
			System.out.println("No Duplicates");
		} else {
			System.out.println("Have Duplicates");
		}
	}

}
