package TestCases_JAN26;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper_JAN26.BaseClass;
import Pages_JAN26.Login;

public class LoginTest extends BaseClass {
	Login login;
	
	@Test(description = "", priority =1)
	public void loginToAP() {
		
		login = PageFactory.initElements(driver, Login.class);
		logger=report.createTest("Login test for AP");
		
		login.validateHomePage();
		logger.pass("Home page validate");
		
		login.enterUserName("Admin");
		login.enterPassword("admin123");
		
		logger.info("Password entered");
		login.clickOnLoginButton();
		logger.info("clicked on login Button");
	}

}
