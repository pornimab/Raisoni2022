package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePOMusingTestNG.KiteHomePage;
import KitePOMusingTestNG.KiteLoginPage;
import KitePOMusingTestNG.KitePinPage;
import KiteUtility.Utility;

public class ValidateKiteUserIDusingEXCEL extends Base
{
	KiteLoginPage login;
	KitePinPage PIN;
	KiteHomePage Home;
	
 @BeforeClass
  public void launchBrowser() 
  {
	openBrowser();
	login = new KiteLoginPage(W);
	PIN =new KitePinPage(W);
	Home = new KiteHomePage(W);
  }
 
 @BeforeMethod
 public void loginToKiteApp() throws EncryptedDocumentException, IOException
 {
	  login.sendusername(Utility.readDataFromExcel1(0, 0));
	  login.sendpassword(Utility.readDataFromExcel1(1, 0));
	  login.ClickonLoginButton();
	  W.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  PIN.sendPin(Utility.readDataFromExcel1(2, 0));
      PIN.ClickonContinueButton();
      W.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    }

  @Test
  
 public void ValidateKiteUserID() throws EncryptedDocumentException, IOException
 {
	Assert.assertEquals(Home.getActualUserName(),Utility.readDataFromExcel1(2, 0),"Actual and Expected are not matching TC is failed");
 }

  @AfterMethod
  public void logOutFromKite() throws InterruptedException
   {
    Home.logOut();
   }
  
  @AfterClass
  public void closeBrowser()
  {
	 W.close();
  }
}


