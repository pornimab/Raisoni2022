package KiteappPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	//1.data members
	//1. Data member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(id="userid") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	
	//2. constructor
	//2. Initialize within a constructor with access level public using pagefactory 
	
	public KiteLoginPage(WebDriver W)
	{
		PageFactory.initElements(W, this);
	}
	
	//3. methods
	//3. Utilize within a method with access level public
	
	public void sendusername()
	{
		username.sendKeys("EJ6667");
	}
	
	public void sendpassword()
	{
		password.sendKeys("swapnil@4258");
	}
	
	public void clickonLoginButton()
	{
		loginbutton.click();
	}
}









