package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//TWO METHODS IN ONE CLASS

public class myTestClass {
  @Test
  public void myMethod1()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

			WebDriver W=new ChromeDriver();
			
			W.manage().window().maximize();
			
			W.get("https://kite.zerodha.com");
  }
  
  @Test
  public void myMethod2()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

			WebDriver W=new ChromeDriver();
			
			W.manage().window().maximize();
			
			W.get("https://vctcpune.com/"); 
  }
}
