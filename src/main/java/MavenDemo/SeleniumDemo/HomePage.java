package MavenDemo.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	/*@FindBy  (xpath="//*[@name='PIM']") //same class ke global element
	private WebElement username;
	
	@FindBy  (xpath="//*[@type='Leave']")
	 private WebElement password;
	
	@FindBy  (xpath="//*[@type='My info']")
	 private WebElement LogInButton;
	
	public HomePage(WebDriver driver)  //constructor calling
	 {
		 PageFactory.initElements (driver, this); //constructor
	 }
	
	 public void VerifyPIMTab()
	 {
		 PIM.isDisplayed();
	 }
	 
	 public void sendpassword()
	 {
		 password.sendKeys("admin123");
	 }
	 
	 
	 public void clickOnLogInButton()
	 {
		 LogInButton.click();
	 }
	*/
	
	
    @FindBy  (xpath="//*[@name='']") //same class ke global element
	private WebElement username;
	
	@FindBy  (xpath="//*[@type='password']")
	 private WebElement password;
	
	@FindBy  (xpath="//*[@type='submit']")
	 private WebElement LogInButton;
	
	public HomePage(WebDriver driver)  //constructor calling
	 {
		 PageFactory.initElements (driver, this); //constructor
	 }
	
	 public void sendUserName()
	 {
		 username.sendKeys("Admin");
	 }
	 
	 public void sendpassword()
	 {
		 password.sendKeys("admin123");
	 }
	 
	 
	 public void clickOnLogInButton()
	 {
		 LogInButton.click();
	 }
	 
}
