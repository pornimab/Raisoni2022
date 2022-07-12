package Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait_study {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://vctcpune.com/");
		
		//W.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //syntax before selenium 4
		
		W.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		W.close();

	}

}
