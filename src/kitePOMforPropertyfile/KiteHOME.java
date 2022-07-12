package kitePOMforPropertyfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class KiteHOME {
	//1.data members
	  
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	
 //2. constructor
	public KiteHOME(WebDriver W)
	{
	  PageFactory.initElements(W, this);
	}
	
 //3. methods
	
	public void validateUserName(String expextedUserID)
	{
	String expextedUserName=expextedUserID;
	String actualUserName = userName.getText();
	
	if(expextedUserName.equals(actualUserName))
	{
	System.out.println("Actual and Expected User Id are matching TC is passed");
	}
	else {
	System.out.println("Actual and Expected User Id are not matching TC is failed");
	}
	}
	
	
	//to get actual userName
	public String getActualUserName()
	{
	String actualUserName = userName.getText();
	return actualUserName;
	}
	public void logOut() throws InterruptedException
	{
	userName.click();
	Thread.sleep(200);
	logOutButton.click();
	}

}
