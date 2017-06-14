package mainClassesOfMicrosoftAppSource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindActiveElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.yaml.snakeyaml.events.Event.ID;

import com.google.inject.Key;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;


import mainClassesOfTestFrameworkWebshop.Sys_WaitForElementPresent;

public class LogInAppsource {
	
	public static WebElement element = null;
	
	//credentials are stored here
	
	static String email = "germanproMXtestOrg@orgAcceptic.onmicrosoft.com";
	static String password = "123456sS@";
	
	
	//click on SIGN IN 
	
	public static WebElement signIN (WebDriver driver) {
		
		element = driver.findElement(By.cssSelector(".signInButton"));
		return element;		
	}
	
	public static void clickOnsignIN (WebDriver driver) {
		element = signIN(driver);
		element.click();		
	}
	
	
	public static WebElement eMailField (WebDriver driver) {
		element = driver.findElement(By.cssSelector("input.c-text-field:nth-child(2)"));
		return element;		
	}
	
	public static void filleMailField (WebDriver driver) {
		element = eMailField(driver);
		element.sendKeys(email);		
	}
	
	
	public static WebElement passwordField (WebDriver driver) {
		element = driver.findElement(By.id("cred_password_inputtext"));
		return element;		
	}
	
	public static void fillpasswordField (WebDriver driver) {
		element = passwordField(driver);
		element.click();
		element.sendKeys(password);		
	}
	
	public static WebElement signInButton_1 (WebDriver driver) {
		element = driver.findElement(By.cssSelector("#react-view > div > div.spza_dialog > div.signInModalClass > div > div.signInModal > div.signInButton > button"));
		return element;		
	}
	
	public static void clicksignInButton (WebDriver driver) {
		element = signInButton_1(driver);
		
		Actions action = new Actions(driver);
		action.moveToElement(element).doubleClick().perform();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	
	
	public static WebElement signInButton_2 (WebDriver driver) {
		element = driver.findElement(By.id("cred_sign_in_button"));
		return element;		
	}
	
	public static void clicksignInButton_2 (WebDriver driver) {
		element = signInButton_2(driver);
		
		Actions action = new Actions(driver);
		action.moveToElement(element).doubleClick().perform();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	
	public static WebElement workLoadLogo (WebDriver driver) {
		element = driver.findElement(By.id("login_workload_logo_text"));
		return element;
	}
	
	public static void clickOnLogo (WebDriver driver) {
		element = workLoadLogo(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		//WaitForElementPresent wait = new WaitForElementPresent();
		//wait.waitforanelement(By.id("login_workload_logo_text"));
		
		element.click();
	}
	
	public static void  signAsDefinedUser (WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		clickOnsignIN(driver);
		
		System.out.println("Clicked on Home Page's Sign In");
		filleMailField(driver);
		
		System.out.println("Filled in an Email");
		clicksignInButton(driver);
		
		System.out.println("Sign In button clicked in Email popup menu");
		fillpasswordField(driver);
		
		System.out.println("Password is filled in");
		clickOnLogo(driver);
		
		System.out.println("Click on Logo");
		clicksignInButton_2(driver);
		
		System.out.println("Click on final LogIn button");
		
	}

	

	
	

}
