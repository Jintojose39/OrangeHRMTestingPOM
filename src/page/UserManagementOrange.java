package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserManagementOrange {
	
	
	@FindBy(id="#menu_admin_viewAdminModule > b")
	WebElement admin;
	
	
	@FindBy(id="searchSystemUser_userName")
	WebElement usernamead;
	
	
	@FindBy(id="#searchSystemUser_employeeName_empName")
	WebElement empnamead;
	
	
	@FindBy(css="#searchSystemUser_userType")
	WebElement usDropDown;
	
	
	@FindBy(css="#searchSystemUser_status")

	WebElement statusDropDown;
	

	@FindBy(css="#searchBtn")
	
	WebElement SearchBtn;
	
	
	@FindBy(css="#resetBtn")
	
	WebElement ResetBtn;
	
	
	@FindBy(css="#ohrmList_chkSelectAll")
	
	WebElement checkList;
	
	
	
	@FindBy(id="welcome")
	WebElement logoutWel;
	
	
	
	@FindBy(id="#welcome-menu > ul > li:nth-child(3) > a")
	
	WebElement logout;
	

	
	WebElement driver;
	
	public UserManagementOrange(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public UserManagementOrange  SearchUser(String username1,String empname,String Admin) {
		
		usernamead.sendKeys(username1);
		
		empnamead.sendKeys(empname);

		Select userdrop =new Select( usDropDown);
		
		userdrop.selectByVisibleText(Admin);
			
		SearchBtn.click();
		
		ResetBtn.click();
	
		return this;
	
	}
	
	
	public UserManagementOrange CheckList() {
		checkList.click();
		
		
		logoutWel.click();
		
		logout.click();
		
		
	
		return this;
	}
	
	
	
	
	
	
	
	
	
}
