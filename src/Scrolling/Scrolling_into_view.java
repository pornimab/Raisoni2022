package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_into_view {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://vctcpune.com/");
		
		//implicit wait
		
		W.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		W.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		JavascriptExecutor JS = (JavascriptExecutor)W; 
		JS.executeScript("arguments[0].scrollIntoview(true)","katraj");
		//js.executeScript("arguments[0].scrollIntoView(true);", referenceElement);
		
		//W.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		//W.findElement(By.className("ANGULAR DEVELOPMENT"));
		//JavascriptExecutor JS = (JavascriptExecutor)W; 
		//JS.executeScript("arguments[0].scrollIntoview(true)","ANGULAR");
	}

}




