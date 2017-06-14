package appSourceAutoTests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import mainClassesOfMicrosoftAppSource.LogInAppsource;

import mainClassesOfTestFrameworkWebshop.Sys_DriverChooseClass;

public class Load_FastStart_FromAppsource_test  {
	
	private WebDriver driver;
	private String baseUrl;
	
	

	
	@Before
	public void SetUp() throws Exception {

	driver = Sys_DriverChooseClass.getDriver("chrome");	
	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //obsolete
	//driver.manage().window().maximize();

	baseUrl = "https://appsource.microsoft.com/";
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		LogInAppsource.signAsDefinedUser(driver);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit(); //to prevent window from closing
	}

}
