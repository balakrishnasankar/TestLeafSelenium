package testleaf.mypractise.selenium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleAnnotations extends BaseTest {

	

	
	  @Test public void M1() {
	  System.out.println("@ SampleAnnotations test M1 method"); }
	  
	  @Test public void M2() {
	  System.out.println("@ SampleAnnotations test M2 method"); }
	 

}
