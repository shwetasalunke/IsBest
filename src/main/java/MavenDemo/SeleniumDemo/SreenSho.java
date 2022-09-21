package MavenDemo.SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SreenSho {

	public static void TakeScreenhots(WebDriver driver) throws IOException 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path="E:\\screenshot"+System.currentTimeMillis()+".jpg";
		
		File dest = new File(path);
		
		FileHandler.copy(src, dest);
	}
	
	
	
	
	
	
	
	
	
}
