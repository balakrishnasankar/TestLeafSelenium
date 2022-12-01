package testleaf.week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableChittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals' and contains(@class,'ch-bar-item')]")).click();
		
		List<WebElement> table =driver.findElements(By.xpath("//table[contains(@class,'table-striped')]//tbody//tr//td[2]"));
		List<String> securityNameList = new ArrayList<String>();
		for(WebElement securityName :table) {
			securityNameList.add(securityName.getText());
		}
		Set<String> set = new HashSet<String>(securityNameList);
		if(securityNameList.size()==set.size()) {
			System.out.println("No Duplicates");
			System.out.println("List Count\t"+securityNameList.size());
			System.out.println("List\t"+securityNameList);
			System.out.println("Set Count\t"+set.size());
			System.out.println("Set Count\t"+set);
		}else {
			System.out.println("Duplicates");
			System.out.println("List Count\t"+securityNameList.size());
			System.out.println("List\t"+securityNameList);
			System.out.println("Set Count\t"+set.size());
			System.out.println("Set Count\t"+set);
		}
	}

}
