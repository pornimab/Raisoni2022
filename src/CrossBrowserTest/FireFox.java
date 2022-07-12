package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox {
  @Test
  public void mymethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\chromedriver_win32\\geckodriver.exe"); 

		WebDriver W=new FirefoxDriver();
		W.manage().window().maximize();
		W.get("https://kite.zerodha.com");
		
		Thread.sleep(2000);
		
		
  }
}
