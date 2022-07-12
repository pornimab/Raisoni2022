package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://skpatro.github.io/demo/");
		
		Thread.sleep(2000);
		
		String mainpageid = W.getWindowHandle();//ID OF MAIN PAGE
		System.out.println(mainpageid);
		
		System.out.println("=========================================");
		
		// To open the child window
		
		W.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		
		// To handle multiple windows/to get multiple ids
		
		Set<String> allPageIDs = W.getWindowHandles();
		Iterator<String> it = allPageIDs.iterator();
		
		
		
		
		
		

	}

}
