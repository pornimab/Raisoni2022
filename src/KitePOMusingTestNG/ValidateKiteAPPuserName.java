package KitePOMusingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAPPuserName 

{
	// Declared Globally
	KiteLoginPage login;
	KitePinPage PIN;
	KiteHomePage Home;
	Sheet NewSheet;
	WebDriver W;
	
  @BeforeClass
  
  public void launch() throws EncryptedDocumentException, IOException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

	  ChromeOptions opt= new ChromeOptions();
	  
	  opt.addArguments("--disable-notifications");
	  
	  
	    W=new ChromeDriver();
		W.manage().window().maximize();
		W.get("https://kite.zerodha.com");
		Reporter.log("browser launcged successfully", true);
		
		W.manage().timeouts().implicitlyWait(Duration.ofMillis(1200));
		
		File myfile= new File("C:\\26march22\\excel file\\Book1.xlsx");
		NewSheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		login = new KiteLoginPage(W);
	
		PIN = new KitePinPage(W);
		Home =new KiteHomePage(W);
		
  }
  
  @BeforeMethod 
  
  public void KiteLoginPage() throws InterruptedException
  {
	  
	  String username = NewSheet.getRow(0).getCell(0).getStringCellValue();
	  String pin = NewSheet.getRow(2).getCell(0).getStringCellValue();
	  String password = NewSheet.getRow(1).getCell(0).getStringCellValue();
	
	  login.sendusername(username);
	  login.sendpassword(password);
	  login.ClickonLoginButton();
	
	  PIN.sendPin(pin);
      PIN.ClickonContinueButton();
      Thread.sleep(1500);
      
    }
  
  @Test
  
  public void T1()
  
  {
	 String expextedUserName = NewSheet.getRow(0).getCell(0).getStringCellValue();
	 
	 String actualusername = Home.getActualUserName();
	 
	 Assert.assertEquals(expextedUserName, actualusername, "actual & ecpected username are not match TC is failed");  
	 Reporter.log("actual & ecpected username are not match TC is pass",true);
	 
  }
  
  @AfterMethod
  
  public void logout() throws InterruptedException
  {
	  
	  Home.logOut();
	 
  }
  
  @AfterClass
  
  public void close()
  {
	  W.close();
  }
  
}
