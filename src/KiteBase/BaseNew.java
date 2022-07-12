package KiteBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

import KiteUtility.UtilityProperty;

public class BaseNew {
 
   protected WebDriver W;
		public void openBrowser() throws IOException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			//opt.addArguments("--disable-notification");
			//opt.addArguments("incognito");
			
		    W=new ChromeDriver();
			W.manage().window().maximize();
	
			W.get(UtilityProperty.getDataFrommyProperties("URL"));
			Reporter.log("Launcher browser",true);
			W.manage().timeouts().implicitlyWait(Duration.ofMillis(1500)); 
		}
	  
			public static void captureScreenShot(WebDriver W, String TCID) throws IOException 
			  {
				  File source	= ((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
				  File destination = new File ("C:\\26march22\\Selenium\\screenshotTake"+TCID+".png");
				  FileHandler.copy(source, destination);
				  
				  }
  }





