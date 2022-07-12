package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;


//Two test & method
public class AnnotationStudy2 {
  @Test
  public void userIDvalidate() 
  {
	  Reporter.log("userID validate",true);
  }
  
  @Test
  public void DashBoardValidate() 
  {
	  Reporter.log("DashBoard Validate",true);
  }
  
  
  @BeforeMethod
  public void logintokiteapp()
   {
	  Reporter.log("Login Success",true);
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("Login out app",true);
  }
  
  @AfterMethod
  public void logoutkiteapp()
  {
	  Reporter.log("Login out app",true);
  }

  @AfterClass
  public void browserclose() 
  {
	  Reporter.log("close browser",true); 
  }

}
