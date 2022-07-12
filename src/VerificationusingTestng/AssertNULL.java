package VerificationusingTestng;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNULL {
  @Test
  public void MethodS2()
  {
	  
	  String Q ="RAISONI";
	  String P =null;
	  
	// Assert NULL Use
	 //Assert.assertNull(P, "value is not null TC is failed");
     // Reporter.log("value is null TC is passed",true);
	  
	// Assert NotNULL Use
	  Assert.assertNotNull(P, "value is null TC is failed");
	  Reporter.log("value is not null TC is passed",true);
	  
	 // Assert.fail(); ----> This is use for to faqil any method
  }
}


