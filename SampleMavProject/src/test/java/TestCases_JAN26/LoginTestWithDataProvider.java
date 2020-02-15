package TestCases_JAN26;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProvidorFactory_JAN26.dataProvidorclass_JAN26;
import Helper_JAN26.BaseClass;
import Pages_JAN26.Login;

public class LoginTestWithDataProvider extends BaseClass {
	
	//it's call inheritance
	Login login;
	
	//LoginDate will be sheet name on excel
	@Test(dataProvider="LoginData")
	public void loginToAp(String uname, String pass) {
		
		
		login = PageFactory.initElements(driver, Login.class);
				
		logger = report.createTest("Login Test for AP");
		
		login.validateHomePage();
		
		logger.pass("Home page validated");
		
		login.enterUserName(uname);
		
		logger.info("username entered");
		
		login.enterPassword(pass);
		
		logger.info("Password entered");
		
		login.clickOnLoginButton();
		
		logger.info("clicked on Login button");
		
	}
	@DataProvider(name="LoginData")
	public Object[][]getDataFromSources(){
		
		System.out.println("Log INFO: Running data provider First to generate the data");
		
		int rows = dataProvidorclass_JAN26.getExcel().getRows("Login");
		System.out.println("Total rows in Excel "+rows);
		
		Object[][]arr=new Object[rows-1][2];
		
		for (int i=0;i<rows-1;i++) {
			arr[i][0]=dataProvidorclass_JAN26.getExcel().getCellData("Login", i+1, 0);
			arr[i][1]=dataProvidorclass_JAN26.getExcel().getCellData("Login", i+1, 1);
		}
			
			System.out.println("LOF INFO : Data providor is ready for usage ");
			
			return arr;
		}
}
