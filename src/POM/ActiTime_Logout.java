package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTime_Logout 
{
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
	public ActiTime_Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout()
	{
		logout.click();
	}
}