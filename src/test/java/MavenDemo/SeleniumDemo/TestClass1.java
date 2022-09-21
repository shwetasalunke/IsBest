package MavenDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		//(verify loginfunctionality)
		
		logIn login = new logIn(driver);
		          login.sendUserName();
		          login.sendpassword();
		          login.clickOnLogInButton();
	      
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		/* //(verify home page)         
		 HomePage home = new HomePage(driver);
		          login.VerifyPIMTab();
		          login.VerifyLeaveTab();
		          login.verifyMyinfoTab();
		   */      
		
		          
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Thread.sleep(3000);
	//boolean result =driver.findElement(By.xpath("//input[@type='password']/parent::div")).isDisplayed();
 WebElement pass=driver.findElement(By.xpath("//input[@type='password']/parent::dive"));
    System.out.println(pass);
		/*
		 * //input[@type='password' and @name='password']
		 * */

	//pass.click()
	//pass.sendKeys(args)
	
	
	
	
	}

}
