package WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();// for maximum window
		W.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		WebElement checkBox1 =W.findElement(By.name("checkBoxOption1"));
		
		//checkBox1.click();
		
		if (checkBox1.isSelected())
		{
		System.out.println("CheckBox is already selected");
		}
		else
		{
		checkBox1.click();
		System.out.println("CheckBox is now selected");
		
	}
	}
}
