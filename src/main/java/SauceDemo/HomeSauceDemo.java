package SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeSauceDemo {

	@FindBy  (xpath="//*[@placeholder='Username']")                                            //same class ke global element
	private  WebElement Username;
	
	@FindBy  (xpath="//*[@type='password']")
	 private  WebElement password;
	
	@FindBy  (xpath="//*[@type='submit']")
	 private WebElement LogInButton;
	
	
	public HomeSauceDemo(WebDriver driver)  //constructor calling
	 {
		 PageFactory.initElements (driver, this); //constructor
	 }
	
	 public void sendUserName()
	 {
		 Username.sendKeys("standard_user");
	 }
	 
	 public void sendpassword()
	 {
		 password.sendKeys("secret_sauce");
	 }
	 
	 
	 public void clickOnLogInButton()
	 {
		 LogInButton.click();
	 }
	
	
}
