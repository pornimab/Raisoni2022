import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver W=new ChromeDriver();
		W.manage().window().maximize();
		
		//step 1
		W.get("https://skpatro.github.io/demo/iframes/");
			
		Thread.sleep(2000);
		
		//step 2
			
		String text1 = W.findElement(By.xpath("//a[text()='Blogger']")).getText();
			
	    System.out.println(text1);
			
		String text2 = W.findElement(By.xpath("//a[text()='Pavilion']")).getText();
			
		System.out.println(text2);
			
		//step 3 -changing focus from main page to frame
		
	    W.switchTo().frame("Frame1");  // by using text (class or id)	
			
	   //W.switchTo().frame(0);       // by using index
	
	   Thread.sleep(2000);
	              
	   String text3 = W.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
	
	   System.out.println(text3);
	
	   //step 4 - switch focus from frame1 to main page
	   // xpath by linked text
	 
	   W.switchTo().parentFrame();
	
	   String text4 = W.findElement(By.linkText("Pavilion")).getText(); // Pavilion is a link and also text
	
	   System.out.println(text4);
	 
      // W.findElement(By.linkText("Pavilion")).click();  // click method for to open the link

       
       //step 5 - switch to frame 2
       W.switchTo().frame("Frame2");

       String text5 = W.findElement(By.linkText("Category3")).getText(); // Category3 is a link and also text

       System.out.println(text5);
       
    
	}

}
