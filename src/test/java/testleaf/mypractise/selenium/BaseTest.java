package testleaf.mypractise.selenium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("BeforeSuite");
	}
}
