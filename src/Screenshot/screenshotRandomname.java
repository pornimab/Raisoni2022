package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshotRandomname {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://kite.zerodha.com/");
		

		Thread.sleep(1000);
			
	File source	= ((TakesScreenshot)W).getScreenshotAs(OutputType.FILE); // (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)
	
	String str = RandomString.make(3);
	
	File destination = new File ("C:\\26march22\\Selenium\\screenshotTake"+str+".png");
	
	FileHandler.copy(source, destination);
	}
}
	