package Generic;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

abstract class ScreenGeneric
{
	abstract void TakesScreenshot();
}

//public class Screenshot_Generic extends ScreenGeneric
//{
//	void TakeScreenShot(WebElement ele, String path, WebDriver driver) 
//	{
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File scr = ts.getScreenshotAs(OutputType.FILE);
//		File dst = new File(path);
//	}
//}