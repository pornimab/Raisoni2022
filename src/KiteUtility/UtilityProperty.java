package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityProperty {

 // public static void captureScreenShot(WebDriver W, String TCID) throws IOException 
 // {
	//  File source	= ((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
	 // File destination = new File ("C:\\26march22\\Selenium\\screenshotTake"+TCID+".png");
	 // FileHandler.copy(source, destination);
	  
	///  } commented for screenshot shifted to BaseNew class
  
  public static String getDataFrommyProperties(String key) throws IOException
  {
  Properties OBJ= new Properties();// created object of properties
  FileInputStream MF= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium26march\\src\\myProperties");
  OBJ.load(MF); 
  
  String value = OBJ.getProperty(key);
  return value;
  }

}

