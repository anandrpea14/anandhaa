package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Time_Track 
{
	@FindBy(xpath="(//div[.='Account Settings'])[3]")
	private WebElement Dropdown;
	
	@FindBy(xpath="//li[.='Log Out']")
	private WebElement Logout;
	
	public Gmail_Time_Track(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickDropdown()
	{
		Dropdown.click();
	}
	public void ClickLogout()
	{
		Logout.click();
	}
}
