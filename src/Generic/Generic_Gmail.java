package Generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Gmail 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.Gmail.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.quit();
	}
}
