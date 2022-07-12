,[]4npackage WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://www.discoveryplus.in");
		
		Thread.sleep(20000);
		W.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		Thread.sleep(20000);
		
		WebElement GetOTPButton = W.findElement(By.xpath("//button[text()='Get OTP']"));
		System.out.println(GetOTPButton.isEnabled());
		
		W.findElement(By.id("mobileNumber")).sendKeys("8550914124");
		
		Thread.sleep(2000);
		System.out.println(GetOTPButton.isEnabled());
		
		GetOTPButton.click();

	}

}
