package TestngSerialandParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Class2 {
  @Test
public void METHOD2() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		RemoteWebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://www.myntra.com/");
  }
}
