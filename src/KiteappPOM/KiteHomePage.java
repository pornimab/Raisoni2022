package KiteappPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	//1.data members
	
	  @FindBy(xpath="//span[@class='user-id']") private WebElement username;
	  @FindBy(xpath ="//a[@target='_self']") private WebElement logoutButton;
	
    //2.Constructor
	public KiteHomePage(WebDriver W)
	{
		PageFactory.initElements(W, this);
	}
	
    //3.Method
	
	 public void validateusername(String expecteduserid)
	 {
	
	 String actualuserid = username.getText();
	 
	 String expecteduserid1 = "EJ6667";
	 
	 if(actualuserid.equals(expecteduserid1))
	 {
		 System.out.println("user id is correct");
	 }
	 
	 else
	 {
		 System.out.println("user id is not correct"); 
	 }
}
	  
	 public void logout() throws InterruptedException
	 {
     username.click();
     
     Thread.sleep(200);
     logoutButton.click();
	 }



}
