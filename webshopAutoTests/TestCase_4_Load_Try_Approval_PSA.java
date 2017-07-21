package webshopAutoTests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import mainClassesOfTestFrameworkWebshop.PSA_Approval_Tab;
import mainClassesOfTestFrameworkWebshop.PSA_Gantt_Tab;
import mainClassesOfTestFrameworkWebshop.PSA_Tracking_Tab;
import mainClassesOfTestFrameworkWebshop.ProMXProductInstallerPage_PSA;
import mainClassesOfTestFrameworkWebshop.Sys_DriverChooseClass;
import mainClassesOfTestFrameworkWebshop.Sys_LogIn;
import mainClassesOfTestFrameworkWebshop.WebShopHomePage;

public class TestCase_4_Load_Try_Approval_PSA {
	
	private WebDriver driver;
	private String baseUrl;
	

	
	@Before
	public void SetUp() throws Exception {

	driver = Sys_DriverChooseClass.getDriver("chrome");	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	//driver.manage().window().maximize();

	baseUrl = "https://appstore.promx.net/";
	}
	
	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		
		/* Sign In as defined User + Set Language = Eng */
		
		Sys_LogIn.signAsDefinedUser(driver);
		WebShopHomePage.clickEnglishSelect(driver);
		
		/*  Test itself */
		
		PSA_Gantt_Tab.installPSA_Gantt(driver);
		
		ProMXProductInstallerPage_PSA.Fill_in_ProMXProductInstallerPage_PSA_main_method(driver);
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(8000);
		driver.quit(); 
	}

}
