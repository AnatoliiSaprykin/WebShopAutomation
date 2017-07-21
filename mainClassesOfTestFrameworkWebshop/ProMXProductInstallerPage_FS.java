package mainClassesOfTestFrameworkWebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProMXProductInstallerPage_FS {
	
	public static WebElement element = null;
	
	
	
	/**
	 * Returns the email field, inputs String in it , waits for field to load
		 */
	
	public static WebElement emailFieldInstaller (WebDriver driver) {
		element = driver.findElement(By.id("cred_userid_inputtext"));
		return element;		
	}
	
	public static void emailFieldInstallerFillIn (WebDriver driver) {
		element = emailFieldInstaller(driver);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		element.click();
		element.clear();
		element.sendKeys(Credentials.emailTrial_fs);
	}
	
	/**
	 * Returns the Password field, inputs String in it , waits for field to load
		 */
	
	public static WebElement passwordFieldInstaller (WebDriver driver) {
		element = driver.findElement(By.id("cred_password_inputtext"));
		return element;		
	}
	
	public static void passwordFieldInstallerFillIn (WebDriver driver) {
		element = passwordFieldInstaller(driver);
		
				
		element.click();
		element.clear();
		element.sendKeys(Credentials.passTrial_fs);
	}
	
	
	/**
	 * Returns the "Sign In" button, pushes it
		 */
	
	public static WebElement signIn_Button_Installer (WebDriver driver) {
		element = driver.findElement(By.id("cred_sign_in_button"));
		return element;		
	}
	
	public static void signIn_Button_Installer_Pusher (WebDriver driver) throws Exception {
		element = signIn_Button_Installer(driver);
		
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		
		
	}
	
	
	/**
	 * Returns the Accept button in new opened page - push
		 */
	
	public static WebElement acceptButton (WebDriver driver) {
		element = driver.findElement(By.cssSelector("#cred_accept_button"));
		return element;		
	}
	
	/*public static void acceptButton_Push (WebDriver driver) throws InterruptedException {
		element = acceptButton(driver);
		
				
		try {		
			Sys_WaitForElementPresent wait = new Sys_WaitForElementPresent();
			wait.waitforanelement((By.id("cred_accept_button")));} catch (NoSuchElementException e) {
			
				System.out.println("The wait timed out, couldnt not find element cred_accept_button");
				}
		
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
	}*/
	
	
	public static void click_acceptButton (WebDriver driver) {
		element = acceptButton(driver);
		element.click();
		
	}
	
	/* Main method */
	
	public static void ProMXProductInstallerPage_FS_main_method (WebDriver driver) {
		emailFieldInstallerFillIn(driver);
		
		passwordFieldInstallerFillIn(driver);
		
		try {
			signIn_Button_Installer_Pusher(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			acceptButton_Push(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		click_acceptButton(driver);
		
	}
	
	
	
}
