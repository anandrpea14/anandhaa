package Generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_ActiTime 
{
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	}
	@BeforeMethod
	public void openAppln()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeAppln()
	{
		driver.quit();
	}
}