package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject.Base;
import pageObject.CartPage;

public class PlaceOrderStepDefinition extends Base {
	CartPage cart=new CartPage(driver);
	
	@Then("^user should be able to tap on cart icon$")
    public void user_should_be_able_to_tap_on_cart_icon() throws Throwable {
		cart.cartIcon().click();;
		cart.cartInfo();
        
    }


    @And("^user should be able to proceed or place for place the order$")
    public void user_should_be_able_to_proceed_or_place_for_place_the_order() throws Throwable {
    	cart.clicknroceedToCheckout();
       

}
}
