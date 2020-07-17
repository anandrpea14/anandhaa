package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Login 
{
	@FindBy(xpath="//*[@id='identifierId']")
	private WebElement untbox;
	@FindBy(xpath="//span[@class='CwaK9']")
	private WebElement next1;
	@FindBy(xpath="//input[@dir='ltr']")
	private WebElement pwdtbox ;
	@FindBy(xpath="//span[@class='CwaK9']")
	private WebElement login;
	
	public Gmail_Login(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void setUsername(String un) 
	{ 
		untbox.sendKeys(un);
	} 
	public void nextLogin()
	{ 
		next1.click();
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
