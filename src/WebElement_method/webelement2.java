package WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 //getText() METHOD

public class webelement2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		
		W.get("https://vctcpune.com/selenium/practice.html");// path of velocity page
		
		Thread.sleep(1000);
		
		 // 1ST METHOD
		W.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		
		 // 2ST METHOD
		String text = W.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		System.out.println(text);
		
		 // 3ST METHOD
		WebElement elements =W.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		System.out.println(elements);
	}

}
