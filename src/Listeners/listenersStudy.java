package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class listenersStudy implements ITestListener {
  @Override
  public void onTestFailure(ITestResult result)
  
  {
	  Reporter.log("take a screenshot",true);
  }
  
  @Override
  public void onTestSuccess(ITestResult result)
  
  {
	  Reporter.log("test passed successfuly",true);
  }
  
  @Override
  public void onTestSkipped(ITestResult result)
  
  {
	  Reporter.log("test is skipped",true);
  }
  
}
