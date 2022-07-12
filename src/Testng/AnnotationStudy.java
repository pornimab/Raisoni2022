package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy {
  @Test
  public void cableRecharge() 
  {
	  Reporter.log("recharge done",true);
  }
  @BeforeMethod
  public void logintoRecharge() 
  {
	  Reporter.log("login done",true);
  }

  @AfterMethod
  public void logoutfromRechargePortal()
  {
	  Reporter.log("logout done",true);
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("browser launched done",true);
  }

  @AfterClass
  public void browserClose()
  {
	  Reporter.log("browser closed",true);
  }

}
