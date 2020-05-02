package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAndDeleteItem extends Base{
	public WebDriver driver;
	public AddAndDeleteItem(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By addI=By.cssSelector("a.increment");
	By quantity=By.cssSelector("input.quantity");
	By addToCart=By.xpath("//button[contains(text(),'ADD TO CART')]");
	
	public void addItem(int n)
	{
		System.out.println("Increase the quantity of item");
		for(int i=0;i<n;i++)
		{
			driver.findElement(addI).click();
		}
		String quantityOfItem=driver.findElement(quantity).getText();
		System.out.println(quantityOfItem);
		
	}
	public WebElement addToCart()
	{
		return driver.findElement(addToCart);
	}
	
	

}
