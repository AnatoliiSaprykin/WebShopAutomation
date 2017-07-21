package mainClassesOfTestFrameworkWebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FastStart_prostorageSaver {
	
	WebDriver driver;
	public static WebElement element = null;
	private static final Logger log = LogManager.getLogger(Sys_LogIn.class.getName());
	
	
	/* ProSS Try */
	
	public static WebElement ProSS_try (WebDriver driver) {
		element = driver.findElement(By.cssSelector("#main > div.container > div > div:nth-child(2) > div > ul > li:nth-child(2) > a"));
		return element;		
	}
	
	
	public static void click_ProSS_try (WebDriver driver) {
		element = ProSS_try(driver);
		element.click();
		
		log.info("Try proSS clicked");		
	}
	
	

	/**
	 * Returns the CRM URL field, inputs String in it (online CRM URL)
		 */
	
	public static WebElement crmUrlField (WebDriver driver) {
		element = driver.findElement(By.id("CrmUrl"));
		return element;
	}
	
	public static void  crmUrlField_FillUrl (WebDriver driver) {
		element = crmUrlField(driver);
		element.click();
		element.clear();
		element.sendKeys(Credentials.crm_url_fs);
		
		log.info("CRM URL is inputted");
	}
	
	
	/**
	 * Returns Install now button
		 */
	
	public static WebElement InstallNow_Button (WebDriver driver) {
		element = driver.findElement(By.cssSelector("#main > div > div:nth-child(3) > div.col-md-5 > form > button"));
		return element;		
	}
	
	public static void InstallNow_Button_Push (WebDriver driver) {
		element = InstallNow_Button(driver);
		element.click();
		
		log.info("Install now button clicked");
	}
	
	
	// Main method
	
	public static void install_proSS (WebDriver driver) {
		click_ProSS_try(driver);
		crmUrlField_FillUrl(driver);
		InstallNow_Button_Push(driver);
		
	}

}
