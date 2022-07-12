package WebElement_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methoduse {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
	
		WebDriver W=new ChromeDriver();
		
		//1. get- to enter url in browser or to open an application.
		W.get("https://vctcpune.com/selenium/practice.html");// path of velocity page
		
		System.out.println("========================================================");
		
		//2. close: to close the current tab of the browser opened by Selenium tool.
		//W.close();

		System.out.println("========================================================");
		
		//3. quit: to close the all the tabs present in browser opened by Selenium tool.
		//W.quit();
		
		System.out.println("========================================================");
		
		//4. maximize/ minimize() - used to maximize/ minimize the browser
		   //note: can't minimize the browser(we can change size & position of the browser).
		   
		  // W.manage().window().maximize();
		 //  W.manage().window().minimize();



		  

	}

}
