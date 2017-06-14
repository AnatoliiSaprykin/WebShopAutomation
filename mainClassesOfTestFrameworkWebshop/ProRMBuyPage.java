package mainClassesOfTestFrameworkWebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class ProRMBuyPage {
	WebDriver driver;
	public static WebElement element = null;
	
	
	/**
	 * Returns User Count field  and input data in it
	  */
	
	public static WebElement userCountField (WebDriver driver) {
		element = driver.findElement(By.id("UserCount"));
		return element;		
	}
	
	public static void fillUserCountField(WebDriver driver, int number) {
		element = userCountField(driver);
		element.clear();
		element.sendKeys(String.valueOf(number));
	}

	
	
	/**
	 * Returns Total price  and verify text in it
	  */
	public static WebElement totalPrice (WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class = 'col-md-8']//dd[@class = 'total-price']"));
		return element;		
	}
	
	public static void findTextInTotalPrice(WebDriver driver, int value) {
		//String bodyText = driver.findElement(By.tagName("body")).getText();
		String bodyText = driver.findElement(By.xpath("//div[@class = 'col-md-8']//dd[@class = 'total-price']")).getText();
		
		Assert.assertTrue("Inputed value is not found!", bodyText.contains(String.valueOf(value)));
	}
	
	/**
	 * Returns Accept license agreement checkbox and clicks it
	  */
	
	public static WebElement acceptLicenseAgreementCheckbox (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".checkbox > label:nth-child(1) > span:nth-child(3)"));
		return element;
		
	}
	
	public static void clickAcceptLicenseAgreementCheckbox(WebDriver driver) {
		element = acceptLicenseAgreementCheckbox(driver);
		element.click();
	}
	
	/**
	 * Returns "Pay with ..." button  and clicks it
	  */
	
	public static WebElement payButton (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".btn"));
		
		return element;
		
	}
	
	public static void clickPayButton (WebDriver driver) {
		element = payButton(driver);
		element.click();
		
	}
}
