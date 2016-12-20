import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//this project is for the facebook website only, just a small initiative for the larger one.

public class facebookAutomate
{
	private static String username = "";
	private static String password = "";
	public static void main(String args[]) throws InterruptedException
	{
		//set the path of geckoDriver
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Webdriver Files\\geckodriver.exe");
		
		//Instantiate the WebDriver class with an object of its subclass FirefoxDriver()
		WebDriver driver = new FirefoxDriver();
		
		//login to your facebook account
		initiateFacebookLogin(driver);
		
		//your driver object is up to date: let's start some fun
		clickProfile(driver);
	}
	public static void clickProfile(WebDriver driver)
	{
		WebElement profile = driver.findElement(By.xpath("//span[contains(.,'Aditya')]"));
		profile.click();
	}
	public static void initiateFacebookLogin(WebDriver driver) throws InterruptedException
	{
		//open the facebook.com website
		driver.get("http:\\facebook.com");
		
		System.out.println("Reached www.facebook.com");
		
		//input elements
		WebElement inputElement = driver.findElement(By.xpath("//input[@id='email']"));
		inputElement.sendKeys(username);
		inputElement.sendKeys(Keys.TAB);
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys(password);
		WebElement buttonElement = driver.findElement(By.xpath("//label[@id='loginbutton']"));
		buttonElement.click();
		
		Thread.sleep(5000);
		
		System.out.println("Reached your facebook home");
	}
}