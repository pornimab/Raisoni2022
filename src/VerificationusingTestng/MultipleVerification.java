package VerificationusingTestng;

import org.junit.Assert;
import org.testng.annotations.Test;

// HARD Assert example

public class MultipleVerification {
  @Test
  public void mymethod()
  {
	  String a="Pune";
	  String b="Pune";

	  Assert.assertNotEquals(a, b,"TC is failed values are equal");

	  Assert.assertNotNull(b, "TC is failed value is null");
	  
  }
}

