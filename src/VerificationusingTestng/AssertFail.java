package VerificationusingTestng;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
  @Test
  public void S1()
  {
	  Reporter.log("Assert fail check", true);
	  Assert.fail();
	  Reporter.log("S1 is running", true); // THIS TC is failed bcz of Assert.fail() method
  }
}


