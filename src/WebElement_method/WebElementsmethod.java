package WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsmethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		
		W.get("https://vctcpune.com/selenium/practice.html");// path of velocity page
		
// 1. Sendkeys():  This method is use to enter value in the input/text field
		
		W.findElement(By.xpath("//input[@id='name']")).sendKeys("advika kuhite");
		Thread.sleep(5000); // thread sleep- stop d execution of the script for the specified time in the script
		
//2. Clear():This method is use to clear value in the text field
		
	W.findElement(By.xpath("//input[@id='name']")).clear();
		Thread.sleep(2000);
		
//3. Click(): Click method is use to click on buttons, links also use to select radio buttons & checkboxes.
		
		W.findElement(By.xpath("//input[@type='radio']")).click();
		 
//4. getText:  This method is use to get text present in a webpage. Return type of getText function is String.
		 
W.findElement(By.xpath("//button[@type='submit']")).getText();
		 
		// String text = W.findElement(By.xpath("//button[@type='submit']")).getText(); //ANOTHER WAY OF text()
		 
	}

}
