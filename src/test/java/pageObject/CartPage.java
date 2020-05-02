package pageObject;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends Base {
	public  WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By cartICon=By.xpath("//a[@class='cart-icon']");
	By itemInfOfCart= By.cssSelector("p.product-name");
	By priceOfParticularProduct=By.cssSelector("p.product-price");
	By proceedToCheck=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	public WebElement cartIcon()
	{
		WebElement cartIconElement=driver.findElement(cartICon);
		return cartIconElement;
	
	}
	public void cartInfo()
	{
		String productName=driver.findElement(itemInfOfCart).getText();
		log.info("Product name is "+productName);
		String productPrice=driver.findElement(priceOfParticularProduct).getText();
		log.info("product price is "+productPrice);
			
	}
	public void clicknroceedToCheckout() throws InterruptedException
	{
		WebElement clickToProceed= driver.findElement(proceedToCheck);
		clickToProceed.click();
		log.info("User ia able to clic on Proceed to checkoutButton");
		Thread.sleep(4000);
		
	}
	
	

}

