package mainClassesOfTestFrameworkWebshop;

import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sys_WaitForElementPresent {
	private WebDriver driver;

	@SuppressWarnings({ "unchecked", "deprecation" })
	public void waitforanelement(By by)
	{
	    WebDriverWait wait = new WebDriverWait(driver,20);
	     wait.until((Predicate<WebDriver>) ExpectedConditions.presenceOfElementLocated(by));
	}
}
