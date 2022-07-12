package KitePOMusingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class KiteLoginPage
{
 
	//1.data members
	    @FindBy(id="userid") private WebElement username;
		@FindBy(id="password") private WebElement password1;
		@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
		
    //2. constructor
		public KiteLoginPage(WebDriver W)
		{
			PageFactory.initElements(W, this);
		}
		
	//3. methods
		
		public void sendusername(String Username)
		{
			username.sendKeys(Username);
		}
		
		public void sendpassword(String Password)
		{
			password1.sendKeys(Password);
		}
		
		public void ClickonLoginButton()
		{
			loginbutton.click();
		}

}


	