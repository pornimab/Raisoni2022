package KiteTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.BaseNew;
import KiteUtility.Utility;
import KiteUtility.UtilityProperty;
import kitePOMforPropertyfile.KiteHOME;
import kitePOMforPropertyfile.KiteLOGIN;
import kitePOMforPropertyfile.KitePIN;

public class validateuserIDforPropertyfile extends BaseNew {
	

    KiteLOGIN login1;
	KitePIN Pin1;
	KiteHOME Home1;
	String TCID="45"; // for naming of screenshot
	

  @BeforeClass

  public void BrowserLaunch() throws IOException
  {
	  openBrowser();
	login1 = new KiteLOGIN(W);
	Pin1 =new KitePIN(W);
	Home1 =new KiteHOME(W);
  }
	
  @BeforeMethod
  public void logintoapp() throws IOException

  {
	  login1.sendusername(UtilityProperty.getDataFrommyProperties("UN"));
	  login1.sendpassword(UtilityProperty.getDataFrommyProperties("PWD"));
	  login1.ClickonLoginButton();
	  
	  Pin1.sendPin(UtilityProperty.getDataFrommyProperties("PIN"));
	  Pin1.ClickonContinueButton();
	  
  }
  
  @Test
  public void validateuserID() throws IOException
  {
	 Assert.assertEquals(Home1.getActualUserName(),UtilityProperty.getDataFrommyProperties("UN"));
	 
	// UtilityProperty.captureScreenShot(W, TCID); // only for screenshot
  }
  
  @AfterMethod
  
  public void logout() throws InterruptedException, IOException
  
  {
	  Assert.fail();  // for method failure then screenshot is taken
	  Home1.logOut();
      BaseNew.captureScreenShot(W, TCID);
  }
  
  @AfterClass
  
  public void Browserclose()
  {
	  W.close();
  }
}
