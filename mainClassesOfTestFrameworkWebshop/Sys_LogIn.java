package mainClassesOfTestFrameworkWebshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sys_LogIn {
	
	public static WebElement element = null;
	
	private static final Logger log = LogManager.getLogger(Sys_LogIn.class.getName());
	
	//credentials are stored here
	
	static String email = "natgreenprorm@gmail.com";
	static String password = "123456sS@";
	
	
	//click on SIGN IN to open fields
	
	public static WebElement signIN (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".nav > li:nth-child(1) > a:nth-child(1)"));
		return element;		
	}
	
	public static void clickOnsignIN (WebDriver driver) {
		element = signIN(driver);
		element.click();		
	}
	
	
	public static WebElement eMailField (WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.form-group:nth-child(2) > input:nth-child(2)"));
		return element;		
	}
	
	public static void filleMailField (WebDriver driver) {
		element = eMailField(driver);
		element.sendKeys(email);		
	}
	
	
	public static WebElement passwordField (WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.form-group:nth-child(3) > input:nth-child(2)"));
		return element;		
	}
	
	public static void fillpasswordField (WebDriver driver) {
		element = passwordField(driver);
		element.click();
		element.sendKeys(password);		
	}
	
	public static WebElement signInButton (WebDriver driver) {
		element = driver.findElement(By.cssSelector("button.btn-primary"));
		return element;		
	}
	
	public static void clicksignInButton (WebDriver driver) {
		element = signInButton(driver);
		element.click();
		
	}
	
	public static void  signAsDefinedUser (WebDriver driver) {
		clickOnsignIN(driver);
		log.info("Clicking on: Sign In link");
		
		filleMailField(driver);
		log.info("Filling in e-mail");
		
		fillpasswordField(driver);
		log.info("Filling in Password");
		
		clicksignInButton(driver);
		log.info("Clicking on: Sign In button");
		
		log.info("End of Login In method - signAsDefinedUser");
		
	}
	

}
