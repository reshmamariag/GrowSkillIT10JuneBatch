package day6_24092025;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CallingPOM {
	@Test           // integrating testng
	public static void executeMethod() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Login_ORHM lin=new Login_ORHM(driver);
		Login_ORHM_PageFact lin=new Login_ORHM_PageFact(driver);
		Logout_ORHM lout=new Logout_ORHM(driver);
		lin.url();
		lin.EnterUserName("Admin");
		lin.EnterPassword("admin123");
		lin.ClickOnLoginButton();
		lout.ClickOnProfile();
		lout.ClickOnLogout();
	}

}
