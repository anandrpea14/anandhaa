package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Generic_Parallel_Gmail 
{
	public WebDriver driver;
	@Parameters("browser")
	@Test
	public void Compose(String browser)
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		if(browser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
			driver.get("https://www.Gmail.com/");
		}
		else
		{
			driver = new ChromeDriver();
			driver.get("https://www.Gmail.com/");
		}
	}
}
