package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
	   W.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // go to main page form Popups 
	    
	    W.findElement(By.name("q")).sendKeys("one plus 10r");
	    
	    W.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
