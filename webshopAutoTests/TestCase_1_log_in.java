package webshopAutoTests;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import mainClassesOfTestFrameworkWebshop.BillingAddressPage;
import mainClassesOfTestFrameworkWebshop.Sys_DriverChooseClass;
import mainClassesOfTestFrameworkWebshop.Sys_LogIn;
import mainClassesOfTestFrameworkWebshop.ProRMBuyPage;
import mainClassesOfTestFrameworkWebshop.WebShopHomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TestCase_1_log_in {
	
	private WebDriver driver;
	private String baseUrl;
	
	private static final Logger log = LogManager.getLogger(Sys_LogIn.class.getName());
	
		
	@Before
	public void SetUp() throws Exception {

	driver = Sys_DriverChooseClass.getDriver("chrome");
	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	//driver.manage().window().maximize();

	baseUrl = "https://appstore.promx.net/";
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		Sys_LogIn.signAsDefinedUser(driver);
		
		WebShopHomePage.clickProRMBuy(driver);
		ProRMBuyPage.fillUserCountField(driver, 6);
		ProRMBuyPage.findTextInTotalPrice(driver, 90);
		ProRMBuyPage.clickAcceptLicenseAgreementCheckbox(driver);
		ProRMBuyPage.clickPayButton(driver);
		BillingAddressPage.fillInAllBillingAddressPageFields(driver, "Acceptic", "nathan", "o'Neil",
				"Region", "Kharkiv", "A911", "Bugrimovoy, 3");
		BillingAddressPage.Go_to_Payment_ButtonPush(driver);
		
		log.info("Test is complete --------------------------------------------");
		
		/*PaymentPage.fillInAllPaymentPageFields(driver, "4111", 123, 1019);
		PaymentPage.Subscribe_ButtonPush(driver);*/ //                           user can input it Manually only
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		driver.quit();
	}
	
}
