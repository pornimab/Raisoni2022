package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://demoqa.com/alerts");
		
		Thread.sleep(1000);
		
	    W.findElement(By.id("alertButton")).click(); 
	        
	  //1. To handle alert popup we need to switch selenium focus from m page to alert popup by using synt
	    
	Alert at  = W.switchTo().alert();
	
	// 2. Alert is an interface which contains abstract methods like:
	// 1. accept(): use to click on ok button.
	// 2. dismiss(): use to click on cancel button.
	// 3. getText(): use to get text present in a alert popup
	
	
	System.out.println(at.getText());
	
	at.accept();
	at.dismiss();

	}

}
