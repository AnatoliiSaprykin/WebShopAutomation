package mainClassesOfTestFrameworkWebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
	public static WebElement element = null;
	
	/**
	 * Returns Card Number field, clears and inputs data in it
	  */	
	
	public static WebElement cardNumberField (WebDriver driver) {
		element = driver.findElement(By.id("credit-card-number"));
		return element;		
	}
	
	public static void cardNumberFieldFill (WebDriver driver, String cardNumber) {
		element = cardNumberField(driver);
		Sys_WaitForElementPresent wait = new Sys_WaitForElementPresent();
		wait.waitforanelement(By.id("credit-card-number"));
		
		element.click();
		element.clear();
		element.sendKeys(String.valueOf(cardNumber));
		
		
		
	}
	
	/**
	 * Returns CVV field, clears and inputs data in it
	  */	
	
	public static WebElement cVVField (WebDriver driver) {
		element = driver.findElement(By.id("cvv"));
		return element;		
	}
	
	public static void cVVFieldFill (WebDriver driver, int CVV) {
		element = cVVField(driver);
		element.click();
		element.clear();
		element.sendKeys(String.valueOf(CVV));
	}
	
	/**
	 * Returns CVV field, clears and inputs data in it
	  */	
	
	public static WebElement expirationDateField (WebDriver driver) {
		element = driver.findElement(By.id("expiration"));
		return element;		
	}
	
	public static void expirationDateFieldFill (WebDriver driver, int expirationDate) {
		element = cVVField(driver);
		element.click();
		element.clear();
		element.sendKeys(String.valueOf(expirationDate));
	}
	
	/**
	 * Returns "Subscribe" button, push
	  */	
	
	public static WebElement subscribe_Button (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".btn"));
		return element;		
	}
	
	public static void Subscribe_ButtonPush (WebDriver driver) {
		element =  subscribe_Button(driver);
		element.click();
	}
	
	/**
	 * Method is filling in all fields
	  */
	
	public static void fillInAllPaymentPageFields (WebDriver driver, String cardNumber,  int CVV, int expirationDate) {
		cardNumberFieldFill(driver, cardNumber);
		cVVFieldFill(driver, CVV);
		expirationDateFieldFill(driver, expirationDate);
	}


}
