package KitePOMusingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class KitePinPage
{
 
 //1.data members
  
    @FindBy(id = "pin") private WebElement PIN;
    @FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	
 //2. constructor
    public KitePinPage(WebDriver W)
	{
		PageFactory.initElements(W, this);
	}
	
 //3. methods
	
    public void sendPin(String pin)
    {
    PIN.sendKeys(pin);
    }
	
	public void ClickonContinueButton()
	{
		continueButton.click();
	}
	  
  }

