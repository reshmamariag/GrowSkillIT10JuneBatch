package day5_19092025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(day5_19092025.ListenersTestMethods.class)//to connect the both classes



public class ListenerDemo {
	
	@Test(priority = 1)//priority can start from '0' or, '1'
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
@Test
public void testToBeFailed()
{
	Assert.assertTrue(false);
}

	@Test
	public void testToBeSkipped()
	{
		throw new SkipException("I'm skipping it deliberatly");
	}
}
