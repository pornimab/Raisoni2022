package TestNGkeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

//If 1 TC execution depends on multiple TC then we need to use "dependsOnMethods" TestNG keyword.

public class DependsOnMethods {
  @Test
  public void G() 
  {

	  Reporter.log("G is running",true); 
	  //Assert.fail();
  }
  
  @Test (dependsOnMethods = {"G"}, priority =- 3)
  public void H()
  {
	  Reporter.log("H is running",true); 
  }
  @Test
  public void I() 
  {
	  Reporter.log("I is running",true); 
  }
  
}


