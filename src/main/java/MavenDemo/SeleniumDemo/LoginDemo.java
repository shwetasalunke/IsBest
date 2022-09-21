package MavenDemo.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDemo {
	WebDriver driver;
	@FindBy (xpath="//input[@placeholder='Username']")
	 private WebElement UN;
	
	@FindBy (xpath="//input[@placeholder=\"Password\"]")
	private WebElement PW;
	
	@FindBy (xpath="//*[@type='submit']")
	private WebElement CLICK;

     public LoginDemo(WebDriver driver) 
     {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Username()
	{
		UN.sendKeys("Admin");
	}

	public void Password()
	{
		PW.sendKeys("admin123");
	}
	
	public void ClickOnLogin()
	{
		CLICK.click();
	}
	
}
