package stepDefinition;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//@RunWith(Cucumber.class)
public class StepDefinition {
	
	  @Given("^User is landing on application page$") public void
	  user_is_landing_on_application_page() {
	  System.out.println("land on webpage");
	  
	  }
	  
	  @When("^User sign up with following details$") public void
	  user_sign_up_with_following_details(DataTable data) throws Throwable {
	  
	  List<List<String>>obj=data.raw(); 
	  for(int i=0;i<5;i++)
	  System.out.println(obj.get(0).get(i)); 
	  
	  }
	  
	  @Then("^Signup button enabled$") public void signup_button_enabled(){
	  System.out.println("button enabled");
	  
	  }
	  
	  @And("^able to complete the registration$") public void
	  able_to_complete_the_registration() {
	  System.out.println("Completed registration");
	  
	  
	  }
	 
	
	  //----REGULAR EXPRESSION IMPLEMENTATION---------
	  
	  @When("^User sign up with following details \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_sign_up_with_following_details_something_and_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	        
	    }
	/*
	 * @Given("^User is landing on application page$") public void
	 * user_is_landing_on_application_page() throws Throwable {
	 * System.out.println("Hello");
	 * 
	 * }
	 * 
	 * @When("^User sign up with following details \"([^\"]*)\" \"([^\"]*)\"$")
	 * public void user_sign_up_with_following_details_something_something(String
	 * strArg1, String strArg2) throws Throwable {
	 * 
	 * System.out.println(strArg1); System.out.println(strArg2); }
	 * 
	 * @Then("^Signup button enabled$") public void signup_button_enabled() {
	 * System.out.println("world");
	 * 
	 * }
	 * 
	 * @And("^able to complete the registration$") public void
	 * able_to_complete_the_registration() { System.out.println("Good morning");
	 * 
	 * }
	 */
	 
	  
	  //-----PARAMETRIZATION IMPLEMENTATION ----------//
	  
	  @Given("^User is on login page$")
	    public void user_is_on_login_page() throws Throwable {
	        System.out.println("Login page");

	    }

	    @When("^User can enter username (.+) and password (.+)$")
	    public void user_can_enter_username_and_password(String username, String password) throws Throwable {
	        
	    	System.out.println(username);
	    	System.out.println(password);
	    }

	    @Then("^click on login in button$")
	    public void click_on_login_in_button() throws Throwable {
	       System.out.println("able to click on login button");
	    }

	    @And("^user should be able to login to banking website or app$")
	    public void user_should_be_able_to_login_to_banking_website_or_app() throws Throwable {
	        System.out.println("User can see the summary screen");
	    }
	    
	    //----Usage of BACKGROUND KEYWORD--------
	    @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
	       System.out.println("Browser validation");
	    }

	    @When("^Browser is launched$")
	    public void browser_is_launched() throws Throwable {
	        System.out.println("Browser is launched");
	    }

	    @Then("^Able to enter url$")
	    public void able_to_enter_url() throws Throwable {
	        System.out.println("eneter the required url");
	    }

	  
}