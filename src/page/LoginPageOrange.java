package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageOrange {
	
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	
	
	@FindBy(id="btnLogin")
	private WebElement lgbtn;
	
	
	
	@FindBy(css="#branding > a:nth-child(1) > img")
	
	private WebElement logo;
	
	
	@FindBy(id="spanMessage")
	
	private WebElement invalidMessage; 
	

	
	
	WebElement driver;
	
	public LoginPageOrange(WebDriver driver) {
		//here we using page factory pattern to initialize web elements which are defined in Page Objects
		
		
		PageFactory.initElements(driver, this);
		
		
	}
	public void 	login(String uname,String pword) {
		
		username.sendKeys(uname);
		password.sendKeys(pword);
		lgbtn.click();
		

	}

	public LoginPageOrange Login(String uname,String pword) {
		
		username.sendKeys(uname);
		password.sendKeys(pword);
		lgbtn.click();
	
		return this;
		
	}
		
	
	

	public LoginPageOrange InvalidLogin(String uname,String pword) {
		
		username.sendKeys(uname);
		password.sendKeys(pword);
		lgbtn.click();
		
		return this;
		
		
	}
	public LoginPageOrange VerifyLogin() {
		
		boolean  lg =logo.isDisplayed();
		
		return this;

}


	public LoginPageOrange VerifyInvalidLogin() {
		
		String act =invalidMessage.getText();
		
		String exp ="Invalid credentials";
		
	
		Assert.assertEquals(act, exp);
		
		return this;
	}
		
	}
