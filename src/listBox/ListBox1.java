package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

			WebDriver W=new ChromeDriver();
			W.manage().window().maximize();
			W.get("https://vctcpune.com/selenium/practice.html");
			
			// 1. Identify list box to be handled and store it in reference variable
			
		
			WebElement listBox = W.findElement(By.name("dropdown-class-example"));
			Thread.sleep(2000);
			//2.Create an object of Select class which will accept WebElement as argument

			Select s= new Select(listBox);
			
			
			//3.By using one of the select class methods we can select values form list box like

			s.selectByVisibleText("Option1");
			Thread.sleep(1000);
			s.selectByValue("option2");
			Thread.sleep(1000);
			s.selectByIndex(0);
	}

}
