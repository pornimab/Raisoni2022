package VerificationusingTestng;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  public void MethodS1()
  {
	  
	  String P ="velocity";
	  String Q ="velocity";
	  
	// Assert Equals Use
	 // Assert.assertEquals(P, Q, "P and Q values are not matching TC failed");
	 // Reporter.log("P and Q values are matching TC PASSED", true);
	  
	// Assert NotEquals Use
	  Assert.assertNotEquals(P, Q, "P and Q values are matching TC failed");
	  Reporter.log("P and Q values are not matching TC PASSED", true);
  }
}



	

	


	 