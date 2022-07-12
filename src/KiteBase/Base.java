package KiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Base 
{
	protected WebDriver W;
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--disable-notification");
		//opt.addArguments("incognito");
		
	    W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://kite.zerodha.com");
		Reporter.log("Launcher browser",true);
		W.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
     
		
  }
}

