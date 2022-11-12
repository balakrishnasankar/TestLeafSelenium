package testleaf.week2.day1.selenium.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver;

		CreateLeadCRM create = new CreateLeadCRM();
		driver = create.createLead("C02M");
		driver.close();
		EditLead edit = new EditLead();
		driver = edit.editLead("C03M");
		driver.close();
		DuplicateLead lead = new DuplicateLead();
		driver = lead.duplicateLead("06M", "07M");
		driver.close();
	}

}
