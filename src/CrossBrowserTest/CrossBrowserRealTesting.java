package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserRealTesting {
    @Parameters("Browsername")
	@Test
  public void test(String name) throws InterruptedException 
  {
    	WebDriver W =null;
	  if(name.equals("firefox"))

	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\chromedriver_win32\\geckodriver.exe"); 
	       
			W=new FirefoxDriver();
	  }
	  
	  else if (name.equals("chrome")) 

	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		   W=new ChromeDriver();
	  
	  }
	  
	    W.manage().window().maximize();
		W.get("https://kite.zerodha.com");
	  
		Thread.sleep(2000);
		//W.close();

  }
}
