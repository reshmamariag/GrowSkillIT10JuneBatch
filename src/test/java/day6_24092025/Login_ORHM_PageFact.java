package day6_24092025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_ORHM_PageFact {
	
WebDriver driver;
	
	public Login_ORHM_PageFact (WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	
	
	
//Repository
	
	@FindBy (name="username") WebElement userNM;
	@FindBy (name="password") WebElement pass;
	@FindBy (xpath="//button[@type='submit']") WebElement login;
	
	
		
	public void url()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void EnterUserName(String nm)
	{
		userNM.sendKeys(nm);
	}
	public void EnterPassword(String ad)
	{
		pass.sendKeys(ad);
	}
	public void ClickOnLoginButton()
	{
		login.click();
	}

		
}
