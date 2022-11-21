package testleaf.week2.day1.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver;

		CreateLeadCRM create = new CreateLeadCRM();
		driver = create.createLead("C08M");
		driver.close();
		EditLead edit = new EditLead();
		driver = edit.editLead("C09M");
		driver.close();
		DuplicateLead lead = new DuplicateLead();
		driver = lead.duplicateLead("10M", "11M");
		driver.close();
	}

}
