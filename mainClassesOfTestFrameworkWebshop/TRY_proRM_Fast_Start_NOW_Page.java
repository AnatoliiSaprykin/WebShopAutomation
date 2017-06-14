package mainClassesOfTestFrameworkWebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TRY_proRM_Fast_Start_NOW_Page {
	
	public static WebElement element = null;
	
	public static String crm_url = "https://orgacceptic.crm4.dynamics.com"; //URL FOR ONLINE CRM
	
	public static String pASSWORD = "123456sS@";   // PASSWORD FOR CRM
	
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
		element.sendKeys(crm_url);
		
	}
	
	public static WebElement InstallNow_Button (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".btn"));
		return element;		
	}
	
	public static void InstallNow_Button_Push (WebDriver driver) {
		element = InstallNow_Button(driver);
		element.click();
	}

}
