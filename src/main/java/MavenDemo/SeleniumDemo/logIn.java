package MavenDemo.SeleniumDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logIn {

//WebDriver driver;	
	
	
/*	logIn login = new logIn(driver);
	          login.sendUserName();
	          login.sendpassword();
	          login.clickOnLogInButton();
	*/        
	
	
    @FindBy  (xpath="//*[@name='username']") //same class ke global element
	private WebElement username;
	
	@FindBy  (xpath="//*[@type='password']")
	 private WebElement password;
	
	@FindBy  (xpath="//*[@type='submit']")
	 private WebElement LogInButton;
	
	 logIn(WebDriver driver)//local value webdriver
	 {
		// this.driver=driver;
		 PageFactory.initElements (driver, this); //constructor
	 }
	
	 public void sendUserName() //wrappers
	 {
		 
  // WebDriverWait wait = new WebDriverWait(driver,30);
  // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
   username.sendKeys("Admin"); //initialised elements
	 }
	 
	 public void sendpassword()
	 {
		// WebDriverWait wait = new WebDriverWait(driver,30);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='password']")));
		 password.sendKeys("admin123");
	 }
	 
	 
	 public void clickOnLogInButton()
	 {
		 LogInButton.click();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//pom class create by three segmenents 1) data members(webelemet) 2)COnstructor 3)actions webelements  
//pom stricly follow encapsulation and pom stricly follow abstraction to use to follow code readabilty
//testcase-->> step by step execution perform check any functionality //test case is the navigation step to varify something
	 //steps test case 1)enter user name 2)enter password3) click on login button and varify functinallity
	//use speific page model login page,home page,test class page objct model
	 //har ek page ke liye class create kar rahe hai... ar variable private hote hai.. use perticular action then we create public method bana dete hai.. in sab ko innitialized karnaa hai constructor innitialiize oject login ke loiye user ke variable khali declared kiya hai then innitialised karne ke liye  constructor pom class implimentation dusre class mai test ng class mai sab setup ar dete hai url
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
	}

