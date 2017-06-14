package webshopAutoTests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import mainClassesOfTestFrameworkWebshop.Sys_DriverChooseClass;
import mainClassesOfTestFrameworkWebshop.FastStart_Installation_Page_In_Progress;
import mainClassesOfTestFrameworkWebshop.Sys_LogIn;
import mainClassesOfTestFrameworkWebshop.ProMXProductInstallerPage;
import mainClassesOfTestFrameworkWebshop.TRY_proRM_Fast_Start_NOW_Page;
import mainClassesOfTestFrameworkWebshop.WebShopHomePage;

public class TestCase_2_Load_Try_FS {
	
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
		Sys_LogIn.signAsDefinedUser(driver);
		WebShopHomePage.clickEnglishSelect(driver);
		
		WebShopHomePage.proRMTryClick(driver);
		
		TRY_proRM_Fast_Start_NOW_Page.crmUrlField_FillUrl(driver);
		TRY_proRM_Fast_Start_NOW_Page.InstallNow_Button_Push(driver);
		
		ProMXProductInstallerPage.emailFieldInstallerFillIn(driver);
		ProMXProductInstallerPage.passwordFieldInstallerFillIn(driver);
		
		ProMXProductInstallerPage.signIn_Button_Installer_Pusher(driver);
		
		//ProMXProductInstallerPage.acceptButton_Push(driver);
		
		FastStart_Installation_Page_In_Progress.progressTitle_Verify_Present(driver);  //verifies if installation is in progress by checking GIF presence
		//FastStart_Installation_Page_In_Progress.Phrase_BackToShop_Wait_To_Load(driver);
	}
	
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		//driver.quit(); to prevent window from closing
	}
}