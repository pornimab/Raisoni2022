package VerificationusingTestng;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void MethodS3() 
  {
	  
	  boolean P= true;
	  boolean Q= false;
	  
	// Assert True Use
	//Assert.assertTrue("TC is failed value is false", Q);
	//Reporter.log("TC is passed value is true ",true);

    //Assert False Use
	  Assert.assertFalse("TC is failed value is true", P);
	  Reporter.log("TC is passed value is false",true);
;
	  
  }  
  }


 