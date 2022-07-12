package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sreenshotTakes1 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		
	File source	= ((TakesScreenshot)W).getScreenshotAs(OutputType.FILE); // (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)
	
	System.out.println(source);
	
	File destination = new File("C:\\26march22\\Selenium\\screenshotTake\\scr1.png");
	
	FileHandler.copy(source, destination);
		
		

	}

}
