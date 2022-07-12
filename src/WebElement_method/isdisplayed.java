package WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(5000);
		
		WebElement hide = W.findElement(By.id("hide-textbox"));
		
		WebElement show = W.findElement(By.id("show-textbox"));
		
		WebElement displayed = W.findElement(By.id("displayed-text"));
	
  hide.click();
   if(displayed.isDisplayed()) 
   {
	   System.out.println("textbox is displayed");
   }
   
   else
   {
	   System.out.println("textbox is not displayed");
   }
   
 
	}

}
