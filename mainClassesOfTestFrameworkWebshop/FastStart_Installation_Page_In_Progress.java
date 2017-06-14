package mainClassesOfTestFrameworkWebshop;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FastStart_Installation_Page_In_Progress {
	
	public static WebElement element = null;
	
	public WebDriver driver;
	
	/*
	 * Returning GIF progress-title, verifying that Installation is in Progress by checking GIF progress-title
	 * */
	
	public static WebElement progressTitle (WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='main']//h3"));
		return element;		
	}
	
	public static boolean progressTitle_Verify_Present (WebDriver driver) throws TimeoutException { 
		//To verify element is present on page or not. ADDED EXEPTION HANDLING!	 
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
		try {		      
		   
		   Boolean iselementpresent = driver.findElements(By.xpath("//div[@id='main']//h3")).size()!= 0;
		   if (iselementpresent == true)
		   {
		    System.out.print("\nTargeted GIF progress-title"+" Is Present On The Page");
		   }
		   else
		   {
		    System.out.print("\nTargeted GIF progress-title"+" Is Not Present On The Page");
		   }
		   } catch (NoSuchElementException e) {         
		        System.out.println("The wait timed out, couldnt not find element");
		        return false;
		    }
		return true;          
		
	}
	
	/*
	 * Wating for  Phrase "Back to Shop"
	 * */
	
	
	public static void Phrase_BackToShop_Wait_To_Load (WebDriver driver) {
		try {		
		Sys_WaitForElementPresent wait = new Sys_WaitForElementPresent();
		wait.waitforanelement(By.xpath("//div[@id='main']/div/div/div/div/h3/a"));} catch (NoSuchElementException e) {
		
			System.out.println("The wait timed out, couldnt not find element Back to Shop");
			}
	}
	
	      
	
	

}
