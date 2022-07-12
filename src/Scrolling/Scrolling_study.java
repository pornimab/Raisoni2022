package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_study {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://vctcpune.com/");
		
		//implicit wait
		W.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));//500
		JavascriptExecutor JS = (JavascriptExecutor)W; 
		JS.executeScript("window.scrollBy(90,800)");

	}

}
