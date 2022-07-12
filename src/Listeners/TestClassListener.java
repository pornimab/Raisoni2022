package Listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClassListener {
	
  @Test
  public void TC1() 
  {
	  Reporter.log("TC1 IS Running", true);
  }
  
  @Test
  public void TC2() 
  {
	  Reporter.log("TC2 IS Running", true);
  }
  
  @Test
  public void TC3() 
  {
	  Assert.fail(); // use for failing the method
	  Reporter.log("TC3 IS Running", true);
  }
  
  @Test(dependsOnMethods="TC3") 
  
  public void TC4() // TC4 is also fail bcz of dependency on TC3
  {
	  Reporter.log("TC4 IS Running", true);
  }
}
