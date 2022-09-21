package MavenDemo.SeleniumDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShort {
	
	
	private static final TimeUnit Thread = null;//reference variable


	@BeforeClass  //it use for execution of test method before execution of test class
	public void BeforeClassMethod()//class 
	{
		System.out.println("beforeclass method");
	}
	
	
	@BeforeMethod//
	public void BeforeMethodMethod()//method
	{
		System.out.println("before Method");
	}
	
	@Test  (invocationCount=4,priority=-1) //to run the test cases for multiple time(invocationCount=3)
	public void TestB()
	
	{
		System.out.println("I am in testB");
	}
	
   @Test (priority=2, timeOut=100) //test cases timeout whenever particular test case takes more time to exe 
	//in that time bcoz of this more time next Tc Also fail.so we declared time out to the particular TC to perposelly fail the this Tc..
	
    public void TestA() throws InterruptedException
	
	{
		System.out.println("I am in testA");
		Assert.fail();
		//Thread.sleep(5000); // whenever u can use timeout thn no need to use T.SLeep
			
	}
	
    @Test (dependsOnMethods={"TestA"})//test cases TC c is depends on A
	public void TestC()
		
		{
			System.out.println("I am in testC");
		}
		
	
	@AfterMethod // method
	public void AfterMethodMethod() //methods of Maven
	{
		System.out.println("After method");
	}
	
	
	@AfterClass//class
	public void AfterClassMethod() //methods of Maven
	{
		System.out.println("After class");
	}
	
}
	
	/*class
	 * method
	 * test
	 * method 
	 * class
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
























