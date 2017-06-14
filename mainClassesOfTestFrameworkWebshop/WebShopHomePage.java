package mainClassesOfTestFrameworkWebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebShopHomePage {
	public static WebElement element = null;
	
	/**
	 * Returns the Home page by clicking logo element
		 */
	public static WebElement homeLogo (WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class = 'container']//div//a[@class = 'navbar-brand']"));
		return element;
	}
	
	public static void  clickHomeLogo (WebDriver driver) {
		element = homeLogo(driver);
		element.click();
		
	}
	
	/**
	 * Returns English language element and clicking on it
	  */
	
	public static WebElement englishSelect (WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id = 'navbar']//ul//li[@class = 'active']"));
		return element;
	}
	
	public static void  clickEnglishSelect (WebDriver driver) {
		element = englishSelect(driver);
		element.click();
	}
	
	/**
	 * Returns DE language element and clicking on it
	  */
	
	public static WebElement deutschSelect (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".lang-select > li:nth-child(1) > a:nth-child(1)"));
		return element;
	}
	
	public static void  deutschSelectclick (WebDriver driver) {
		element = deutschSelect(driver);
		element.click();
	}
	
	
	/**
	 * Returns proRM Buy element and clicking on it
	  */
	
	public static WebElement proRMBuy (WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class = 'col-md-6']//ul//a[contains(@href,'/licenses/buy/1')]"));
		return element;
	}
	
	public static void  clickProRMBuy (WebDriver driver) {
		element = proRMBuy(driver);
		element.click();
		
	}
	
	/**
	 * Returns proRM Try element and clicking on it
	  */
	
	public static WebElement proRMTry (WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.col-md-6:nth-child(1) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(2) > a:nth-child(1)"));
		return element;
	}
	
	public static void  proRMTryClick (WebDriver driver) {
		element = proRMTry(driver);
		element.click();
		
	}
	
	}
