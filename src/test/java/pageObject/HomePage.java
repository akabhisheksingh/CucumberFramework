package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	/*
	 * @FindBy(xpath="//input[@type='search']") public static WebElement
	 * searchProduct;
	 */
	 
	By search=By.xpath("//input[@type='search']");
	
	/*
	 * @FindBy(css="h4.product-name") public static WebElement productName;
	 */
	By productName=By.xpath("//*[@class='product-name']");
	
	public WebElement searchItems()
	{
		return driver.findElement(search);
		
	}
	
	public WebElement productDetails()
	{
		return driver.findElement(productName);
	}
	

}
