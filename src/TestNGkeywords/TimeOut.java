package TestNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

//If test class contains multiple test methods if one of the test method is 
//time consuming to execute then TestNG bydefault fail that TC & executes the other TC.

public class TimeOut {
  @Test
  public void R() 
  {
	  Reporter.log("R is running",true); 
  }
  @Test(timeOut=1500)
  public void Q() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("Q is running",true); 
  }
  @Test
  public void S() 
  {
	  Reporter.log("S is running",true); 
  }
}


