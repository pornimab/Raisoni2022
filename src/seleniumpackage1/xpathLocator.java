package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
 
		WebDriver W=new ChromeDriver();
		
		// 1.xpath by attribute
		
		W.get("https://vctcpune.com/selenium/practice.html");
		//W.findelement(By.xpath String xpathexpression):By
		//W.findelement(By.xpath(//tagname[@attribute name='attribute value']).click(); for wording
        W.findElement(By.xpath("//h1[@style='font-weight: 500; margin-left:10px;']")).click();
        
       // W.findelement(By.xpath(//tagname[@attribute name='attribute value']).sendkeys(type any comment); for typing in box
        W.findElement(By.xpath("//input[@type='text']")).sendKeys("hello pornima"); //for Suggession Class Example
        
        W.findElement(By.xpath("//input[@type='radio']")).click(); //Radio Button Example
        W.findElement(By.xpath("//input[@id='checkBoxOption1']")).click(); //Checkbox Example
        W.findElement(By.xpath("//input[@id='name']")).sendKeys("advika kuhite"); //for Switch To Alert Example
               
        W.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("show examples 123");
        W.findElement(By.xpath("//div[@class='row']")).click(); 
        
        System.out.println("========================================================");
        
        // 2.xpath by text
        
        
        System.out.println("========================================================");
        
        // 3.xpath by contains()
        
        // I.Contains with text() :
        // SYNTAX : //tagname[contains(text(),’textvalue’)]
        
        
       // II.	Contains with attribute :
       //tagname[contains(@attribute name, ‘attribute value’)]
        W.findElement(By.xpath("//a[contains(@class,'navbar')]")).click(); //for attribute value to long we are using any one or two word from value with the help of contains
        
        System.out.println("========================================================");
        
      //  4.	xpath by index
      //  (//tagname[@attribute name = ‘attribute value’] )[2]
        W.findElement(By.xpath("//input[@name='radio'][3]")).click(); //xpath by index for same attribute value present then we are using index  
        
        


        
        
        
        
        
	}

}
