package pageObject;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	//public static void main(String[] args) 
		

	public  static WebDriver getDriver() throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\pavilion\\Desktop\\Selenium Tutorial "
				+ "Package\\CucumberBasic\\src\\test\\java\\helpers\\globalProperties.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavilion\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
		
		return driver;
	}

}
