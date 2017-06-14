package mainClassesOfTestFrameworkWebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingAddressPage {
	
	public static WebElement element = null;
	
	/**
	 * Returns Company field, clears and input data in it
	  */
	
	
	public static WebElement companyField (WebDriver driver) {
		element = driver.findElement(By.id("Company"));
		return element;		
	}
	
	public static void fillCompanyField (WebDriver driver, String Company) {
		element = companyField(driver);
		element.click();
		element.clear();
		element.sendKeys(String.valueOf(Company));
	}
	
	/**
	 * Returns First name field, clears and input data in it
	  */
	
	public static WebElement firstNameField (WebDriver driver) {
		element = driver.findElement(By.id("FirstName"));
		return element;		
	}
	
	public static void fillFirstNameField (WebDriver driver, String firstName) {
		element = firstNameField(driver);
		element.click();
		element.clear();
		element.sendKeys(String.valueOf(firstName));
	}
	
	/**
	 * Returns Last name field, clears and input data in it
	  */
	
	public static WebElement lastNameField (WebDriver driver) {
		element = driver.findElement(By.id("LastName"));
		return element;		
	}
	
	public static void fillLastNameField (WebDriver driver, String lastName) {
		element = lastNameField(driver);
		element.click();
		element.clear();
		element.sendKeys(String.valueOf(lastName));
	}
	
	//country dropdown
	
	
	/**
	 * Returns Region field, clears and input data in it
	  */
	
	public static WebElement regionField (WebDriver driver) {
		element = driver.findElement(By.id("Region"));
		return element;		
	}
	
	public static void fillRegionField (WebDriver driver, String region) {
		element = regionField(driver);
		element.click();
		element.clear();
		element.sendKeys(String.valueOf(region));
	}
	
	/**
	 * Returns City  field, clears and input data in it
	  */
	
	public static WebElement cityField (WebDriver driver) {
		element = driver.findElement(By.id("Locality"));
		return element;		
	}
	
	public static void fillCityField (WebDriver driver, String City) {
		element = cityField(driver);
		element.click();
		element.clear();
		element.sendKeys(String.valueOf(City));
	}
	
	/**
	 * Returns Postal Code  field, clears and input data in it
	  */
	
	public static WebElement postalCodeField (WebDriver driver) {
		element = driver.findElement(By.id("PostalCode"));
		return element;		
	}
	
	public static void fillPostalCodeField (WebDriver driver, String postalCodeInt) {
		element = postalCodeField(driver);
		element.click();
		element.clear();
		element.sendKeys(String.valueOf(postalCodeInt));
	}
	
	/**
	 * Returns Number and Street Name  field, clears and input data in it
	  */
	
	public static WebElement numberAndStreetNameField (WebDriver driver) {
		element = driver.findElement(By.id("StreetAddress"));
		return element;		
	}
	
	public static void fillNumberAndStreetNameField (WebDriver driver, String numberAndStreetName) {
		element = numberAndStreetNameField(driver);
		element.click();
		element.clear();
		element.sendKeys(String.valueOf(numberAndStreetName));
	}
	
	/**
	 * Returns Country  dropdown, selects state
	  */
	
	public static WebElement countryDropDownMenu (WebDriver driver) {
		element = driver.findElement(By.id("CountryCodeNumeric"));
		return element;		
	}
	
	public static void chooseCountryDropDownMenu (WebDriver driver) {
		element = countryDropDownMenu(driver);
		element.click();
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		
	}
	
	/**
	 * Returns "Go to Payment" button , push it
	  */
	
	public static WebElement Go_to_Payment_Button (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".btn"));
		return element;		
	}
	
	public static void Go_to_Payment_ButtonPush (WebDriver driver) {
		element =  Go_to_Payment_Button(driver);
		element.sendKeys(Keys.ENTER);
	}
	
	
	/**
	 * Method is filling in all fields, Random Country
	  */
	
	public static void fillInAllBillingAddressPageFields (WebDriver driver, String Company, String firstName,
			String lastName, String region, String City, String postalCodeInt, String numberAndStreetName) {
		fillCompanyField(driver, Company);
		fillFirstNameField(driver, firstName);
		fillLastNameField(driver, lastName);
		fillRegionField(driver, region);
		fillCityField(driver, City);
		fillPostalCodeField(driver, postalCodeInt);
		fillNumberAndStreetNameField(driver, numberAndStreetName);
		chooseCountryDropDownMenu(driver);
		
	}
	
	

}
