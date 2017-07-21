package webshopAutoTests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import mainClassesOfTestFrameworkWebshop.FastStart_prostorageSaver;
import mainClassesOfTestFrameworkWebshop.PSA_Gantt_Tab;
import mainClassesOfTestFrameworkWebshop.ProMXProductInstallerPage_FS;
import mainClassesOfTestFrameworkWebshop.ProMXProductInstallerPage_PSA;
import mainClassesOfTestFrameworkWebshop.Sys_DriverChooseClass;
import mainClassesOfTestFrameworkWebshop.Sys_LogIn;
import mainClassesOfTestFrameworkWebshop.WebShopHomePage;

public class TestCase_6_Load_Try_proAdSearch_FS {
	
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
		
		FastStart_prostorageSaver.install_proSS(driver);
		
		ProMXProductInstallerPage_FS.ProMXProductInstallerPage_FS_main_method(driver);
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(8000);
		driver.quit(); 
	}

}
