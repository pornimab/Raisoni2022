package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng1 {
	
  @Test //this for method/test case
  
  public void kiteLogin() {
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		
		W.manage().window().maximize();
		
		W.get("https://kite.zerodha.com");
  }

}
