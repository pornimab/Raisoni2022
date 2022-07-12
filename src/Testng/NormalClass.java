package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://kite.zerodha.com");

	}

}
