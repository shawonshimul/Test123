package Pages_JAN26;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import Helper_JAN26.Utility;
public class Login {
	
	WebDriver driver;
	public Login(WebDriver Idriver) {
		this.driver=Idriver;
}
	/*@FindBy(xpath ="//a[@class='login']") WebElement SignIN;
	@FindBy(xpath ="//input[@id='email']") WebElement Email;
	@FindBy(xpath ="//input[@id='passwd']") WebElement password;
	@FindBy(xpath ="//button[@id='SubmitLogin']") WebElement Loginbutton;
	*/
	@FindBy(xpath ="//input[@id='txtUsername']") WebElement Email;
	@FindBy(xpath ="//input[@id='txtPassword']") WebElement password;
	@FindBy(xpath ="//input[@id='btnLogin']") WebElement Loginbutton;
	
	public void validateHomePage() {
		Utility.validateContainsTitle(driver, "OrangeHRM");
	}
	
	/*public void ClickonSingin() {
		System.out.println("LOG : INFO submit button clicked");
		Utility.waitForWebElement(driver, Loginbutton).click();
		
	} */
	public void enterUserName(String uname) {
		System.out.println("LOG:INFO Username entered ");
		Utility.waitForWebElement(driver, Email).sendKeys(uname);
		
	}
	public void enterPassword(String pword) {
		System.out.println("LOG:INFO Password given ");
		Utility.waitForWebElement(driver, password).sendKeys(pword);
	}
	
	public void clickOnLoginButton() {
		System.out.println("LOG : INFO submit button clicked");
		Utility.waitForWebElement(driver, Loginbutton).click();
	}

}
