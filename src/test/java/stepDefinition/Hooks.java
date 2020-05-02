package stepDefinition;



//import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObject.Base;


public class Hooks extends Base {
	

	@Before("@SeleniumTest")
	public void beforevaldiation()
	{
		System.out.println("Before Mobile  hook");
	}
	//@Before("@SeleniumTest")
	
	@After("@SeleniumTest")
	public void closeBrowser()
	{
		driver.close();
	}

}
