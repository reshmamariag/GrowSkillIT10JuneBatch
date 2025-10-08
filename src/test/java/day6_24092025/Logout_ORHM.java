package day6_24092025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Logout_ORHM {
	
	WebDriver driver;
	
	public Logout_ORHM(WebDriver driver)//constructor
	{
		this.driver=driver;
	}
//Repository
	By profile=By.className("oxd-userdropdown-tab");
	By logout=By.xpath("ul[@role='menu']/child::li[4]/child::a");
	
	public void ClickOnProfile()
	{
		driver.findElement(profile).click();
	}
	
	public void ClickOnLogout()
	{
		driver.findElement(logout).click();
	}
}
