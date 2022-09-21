package MavenDemo.SeleniumDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.LoginUtilityDemo;
import Utility.ScreenShott;

public class LoginTestDemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void ChromeOpen()
	{
		driver= LoginUtilityDemo.setup();	
	}
	
	@Test
	public void LoginDemo() throws IOException
{
	LoginDemo login=new LoginDemo(driver);
	login.Username();
	login.Password();
    login.ClickOnLogin();
    
    ScreenShott.TakeSceenshots(driver);
   
}
	
/*@AfterTest
public void ChromeClose()
{
	driver.close();
}*/
}


















