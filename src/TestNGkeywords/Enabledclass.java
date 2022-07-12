package TestNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabledclass {
	
  @Test(enabled=false)
  public void laptop() 
  {
	  Reporter.log("laptop is working",true);
  }
  
 @Test
  public void Tv() 
  {
	  Reporter.log("tv is working",true);
  }
 @Test
 public void mobile() 
 {
	  Reporter.log("mobile is working",true);
 }

}







