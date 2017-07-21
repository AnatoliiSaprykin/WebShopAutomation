package mainClassesOfTestFrameworkWebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PSA_Approval_Tab {
	
	WebDriver driver;
	public static WebElement element = null;
	private static final Logger log = LogManager.getLogger(Sys_LogIn.class.getName());
	
	
	
	/**
	 * Returns the Home page by clicking logo element
		 */
	
	public static WebElement approvalTab_TRY (WebDriver driver) {
		element = driver.findElement(By.cssSelector("#main > div.container > div > div:nth-child(5) > div > ul > li:nth-child(2) > a"));
		return element;
	}
	
	public static void  click_approvalTab_TRY (WebDriver driver) {
		element = approvalTab_TRY(driver);
		element.click();
		
		log.info("Returns TRY Approval FOR MICROSOFT PSA  page");		
		
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
		element.sendKeys(Credentials.crm_url);
		
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
	}
	
	
	//main method
	
	public static void installPSA_approval (WebDriver driver) {
		click_approvalTab_TRY (driver);    // 1. Clicking on Try Approval
		log.info("Clicking on: Try Tracking PSA");
		
		crmUrlField_FillUrl(driver);
		log.info("Filling in CRM URL");
		
		InstallNow_Button_Push(driver);
		log.info("Pushing Install now button");
		
		
		
	}

}
