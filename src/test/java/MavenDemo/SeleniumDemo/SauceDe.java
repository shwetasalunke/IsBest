package MavenDemo.SeleniumDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SauceDemo.LogSauceDemo;
import Utility.ScreenShott;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDe {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		
		LogSauceDemo SauceDe = new LogSauceDemo(driver);
		SauceDe.sendUserName();
		SauceDe.sendpassword();
		SauceDe.clickOnLogInButton();
		
		  ScreenShott.TakeSceenshots(driver);
		   

	}

}
