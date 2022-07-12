package TestNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

//To change test method/TC execution order we need to use TestNG keyword "priority".

public class PriorityClass {
  @Test (priority=-3) 
  public void A()
  {
	  Reporter.log("I AM MANUAL TESTER",true);
  }
  
  @Test
  public void B()
  {
	  Reporter.log("I AM AUTOMATION TESTER",true); 
  }
  
  @Test(priority=-1)
  public void C()
  {
	  Reporter.log("I AM DEVELOPER",true); 
  }
}


