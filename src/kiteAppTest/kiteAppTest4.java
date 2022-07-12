package kiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteAppTest4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://kite.zerodha.com");
		
		Thread.sleep(2000);
		
		WebElement Userid = W.findElement(By.id("userid"));
	    WebElement password = W.findElement(By.id("password"));
		WebElement loginbutton = W.findElement(By.xpath("//button[@type='submit']"));
		
		Userid.sendKeys("EJ6667");
		password.sendKeys("swapnil@4258");
		loginbutton.click();
		
		Thread.sleep(1000);
		WebElement Pin = W.findElement(By.xpath("//input[@type='password']"));
		 Pin.sendKeys("824748");
		 
	    WebElement ContinueButton = W.findElement(By.xpath("//button[@type='submit']"));  
	    Thread.sleep(200);
	    ContinueButton.click();
	    
	  Thread.sleep(2000);
	    
	 WebElement username = W.findElement(By.xpath("//span[@class='user-id']"));
	 
	 String actualuserid = username.getText();
	 
	 String expecteduserid = "EJ6667";
	 
	 if(actualuserid.equals(expecteduserid))
	 {
		 System.out.println("user id is correct");
	 }
	 
	 else
	 {
		 System.out.println("user id is not correct"); 
	 }
	    
    username.click();
    
    W.findElement(By.xpath("//a[@target='_self']")).click();
    W.close();
	
	}

}
