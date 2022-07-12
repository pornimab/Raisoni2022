package KiteappPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_PinPage {
	
	     //1.data members
			@FindBy(id="pin") private WebElement pin;
			@FindBy(xpath ="//button[@type='submit']") private WebElement continueButton;
			
		//2.Constructor
			public Kite_PinPage(WebDriver W)
			{
				PageFactory.initElements(W, this);
			}
			
		//3.Method
			public void sendPin()
			{
			pin.sendKeys("824748");
			}
			public void clickOncontinueButton()
			{
			continueButton.click();
			}
}


