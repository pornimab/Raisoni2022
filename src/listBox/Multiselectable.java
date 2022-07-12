package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

			WebDriver W=new ChromeDriver();
			W.manage().window().maximize();
			
			W.get("https://demoqa.com/select-menu");
			
			Thread.sleep(1000);
			
	          WebElement multiSelectElement = W.findElement(By.name("cars"));
			
			Select s=new Select(multiSelectElement);
			
			System.out.println("Multi Select status is "+s.isMultiple());
			
			//1. selectByVisibleText: selectByVisibleText(String arg0) 
			
			s.selectByVisibleText("Volvo");
			Thread.sleep(1000);
			
			//2. selectByIndex: selectByIndex(int arg0)
			
		    s.selectByValue("saab");
		     Thread.sleep(100);
			
			//3. selectByValue: selectByValue(String arg0)
			
		    s.selectByIndex(0);
			Thread.sleep(100);
			
			s.selectByIndex(1);
			
			
			//s.deselectAll();
			//Thread.sleep(100);
			//s.deselectByIndex(0); // we are selected & deselected by 3 types by text ,value & index
			//Thread.sleep(100);
			//s.deselectByIndex(1);
			
			
			
			System.out.println(s.getFirstSelectedOption().getText());
			
			//s.getAllSelectedOptions();
			
		}
}

		

