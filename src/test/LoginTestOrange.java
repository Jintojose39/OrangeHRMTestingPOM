package test;

import org.testng.annotations.Test;

import graphql.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.LoginPageOrange;

public class LoginTestOrange {
	
	
	static WebDriver driver;
	

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	@Test
	public void loginTest() {
		LoginPageOrange lg =new LoginPageOrange(driver);
		lg.Login(null, null);
		
		boolean img =driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(5) > div > a > img")).isDisplayed();
		
		Assert.assertTrue(img);

	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
}
