package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTime_Login 
{
	//Declaration
	@FindBy(id="//input[@id='email']")
	private WebElement untbox;
	
	@FindBy(name="//input[@id='pass']")
	private WebElement pwdtbox;
	
	@FindBy(xpath="//input[@id='u_0_b']")
	private WebElement login;
	
	//initialization
	public ActiTime_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void setUsername(String un)
	{
		untbox.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		login.click();
	}
}