package Helper_JAN26;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass; //need afterclass testing
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
		//we are creating object so we can reference back to them
		//instead of calling the jar files every time
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setupReport() 
	{
		System.out.println("Log info-Before suit Running-setting up report");
		//it'll execute the report and will save to folder in html format
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/AP_"+Utility.getTime()+".html"));
		report=new ExtentReports();
		report.attachReporter(reporter);
		
		System.out.println("LOG:INFO - After Suite Running - Reports are ready to use");
	}
		@BeforeClass
		public void setupBrowser() 
		{ //calling the driver and BrowserFactories_JAN26 for the browser calling
			System.out.println("log:INFO: creating browser session");
			
 
			
			System.out.println("LOG:INFO: Browser session created");
		
		}
		@AfterMethod //calling dependency which has ITestresult from TestNG and creating a class
		public void appendReport(ITestResult result) 
		{ // get the name of the test we are running
			System.out.println("Test Name "+result.getName());
			
			System.out.println("Log:INFO- After method Runing - Genereting test report");
			//get the status result which is in Binary number like (0,1,2,3 for pass fail success skip)
			int status=result.getStatus();
			
			if(status==ITestResult.SUCCESS) 
			{
				try { //if the result pass but didn't get the result that case it'll take screenshot. build is for action class method
					logger.pass("Test Scenario Passed ",MediaEntityBuilder.createScreenCaptureFromPath(Utility.captureScreenShot(driver)).build()) ;
			
				}catch(IOException e) {//if some type of error is happening it'll catch the error
					System.out.println("Not able to be attach screenshot"+e.getMessage());
					}	
				}
			else if(status==ITestResult.FAILURE) 
			{
				try {
					logger.fail("Test Failed"+result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(Utility.captureScreenShot(driver)).build()) ;
				}catch(IOException e) {
					System.out.println("not able to attach screnshot "+e.getMessage());													
				}
			}
			else if(status==ITestResult.SKIP) 
			{
				logger.skip("Test sscenario skipper");
			}
			report.flush();//clean everything after test completed
			
			System.out.println("Log:INFO - After method Executed- Test rulutl appene");
		}
		
	/*	@AfterClass
		public void closeSessions() {
			System.out.println("Log info: closing browser session");
			driver.quit();
			System.out.println("Browser session closed");
		} */
		
	}

