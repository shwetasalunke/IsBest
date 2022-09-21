package SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogSauceDemo {
	
	@FindBy  (xpath="//*[@placeholder='Username']")                                            //same class ke global element
	private  WebElement Username;
	
	@FindBy  (xpath="//*[@type='password']")
	 private  WebElement password;
	
	@FindBy  (xpath="//input[@id='login-button']")
	 private WebElement LogInButton;
	
	public LogSauceDemo (WebDriver driver)                                                            //local value webdriver
	 {
		// this.driver=driver;
		 PageFactory.initElements (driver, this);                                                 //constructor
	 }
	
	 public  void sendUserName()                                                                                //wrappers
	 {
		 Username.sendKeys("standard_user");                                                             //initialised elements
	 }
	 
	 public  void sendpassword()
	 {
		 password.sendKeys("secret_sauce");
	 }
	 
	 
	 public  void clickOnLogInButton()
	 {
		 LogInButton.click();
	 }
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	// WebDriverWait wait = new WebDriverWait(driver,30);
	  // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));	

		// WebDriverWait wait = new WebDriverWait(driver,30);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='password']")));
	
	

}
