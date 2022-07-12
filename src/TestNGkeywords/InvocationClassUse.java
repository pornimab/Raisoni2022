package TestNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationClassUse {
  @Test(invocationCount = 3)
  public void SK1()
  {
	  Reporter.log("who are you",true);
  }
  
  @BeforeMethod
  public void SK2()
  {
	  Reporter.log("i am advika",true);
  }
}



