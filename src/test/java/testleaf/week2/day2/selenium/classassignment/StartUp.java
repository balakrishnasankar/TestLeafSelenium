package testleaf.week2.day2.selenium.classassignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver;

		CreateLeadCRMXpath create = new CreateLeadCRMXpath();
		driver = create.createLead("D01A");
		
	}

}
