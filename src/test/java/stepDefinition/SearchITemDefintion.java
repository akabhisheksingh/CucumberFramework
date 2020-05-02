
package stepDefinition;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObject.AddAndDeleteItem;
import pageObject.Base;
import pageObject.HomePage;

@RunWith(Cucumber.class)
public class SearchITemDefintion extends Base { 
	public static Logger log=LogManager.getLogger(Base.class.getName());
	WebDriver driver;
	HomePage home;
	AddAndDeleteItem addCart;
	

	@Given("^User is on Shopping page of Green cart$")
	public void user_is_on_shopping_page_of_green_cart() throws Throwable {
		driver = Base.getDriver();
		log.info("Launch the browser");
	
	

	}

	@When("^user search for \"([^\"]*)\" Vegetables$")
	public void user_search_for_Vegetables(String arg1) throws Throwable {
		home = new HomePage(driver);
		home.searchItems().sendKeys(arg1);
		Thread.sleep(2000);

	}

	@Then("^\"([^\"]*)\" vegetables should displayed$")
	public void something_vegetables_should_displayed(String strArg1) throws Throwable {
		home = new HomePage(driver);
		/*
		 * String actual = home.productDetails().getText(); String actualText =
		 * actual.substring(0, 7); Assert.assertEquals(actualText, strArg1);
		 */
		Assert.assertTrue( home.productDetails().getText().contains(strArg1));

	}
	  @Then("^increase the quantity of item$")
	    public void increase_the_quantity_of_item() throws Throwable {
		  addCart=new AddAndDeleteItem(driver);
	     addCart.addItem(2);
	    }

	    @And("^Add Item to cart$")
	    public void add_item_to_cart() throws Throwable {
	    	addCart=new AddAndDeleteItem(driver);
	    	addCart.addToCart().click();
	        
	    }

}
