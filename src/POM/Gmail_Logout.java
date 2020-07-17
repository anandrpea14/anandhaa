package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Logout
{
	@FindBy(xpath="(//img[1])[2]")
	private WebElement GooAcco;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement Logout;
	
	public Gmail_Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickGooAcco()
	{
		GooAcco.click();
	}
	public void ClickLogout()
	{
		Logout.click();
	}
}
