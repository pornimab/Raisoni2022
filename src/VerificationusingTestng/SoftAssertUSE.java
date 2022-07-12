package VerificationusingTestng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUSE {
  @Test
  public void Testing() 
  {
	  
	  String w = "123";
	  String v = "trp";
	  
	  SoftAssert st = new SoftAssert();
	  
	  st.assertEquals(w, v, "w & v is not matching TC is failed");
	  st.assertNull("value is not null TC is failed", v);
	  st.assertAll();
	  }

  @Test
  public void method() 
  {
	  
	 boolean w = true;
	 boolean v = false;
	  
	  SoftAssert pk = new SoftAssert();
	  
	  pk.assertTrue(v, "value of v is false TC is failed");
	  pk.assertFalse(w, "value of w is true TC is failed ");
	  pk.assertAll();
	  }
  
}
