package Generic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions_Generic 
{
	public static void Mouse(WebElement ele,WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public static void DragDrop(WebElement ele,WebElement ele1,WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(ele, ele1).perform();
	}
	public static void DoubleClick(WebElement ele,WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	public static void RightClick(WebElement ele,WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}
	public static void Composite(WebElement ele,WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).click(ele).perform();
		act.sendKeys(Keys.SHIFT).click(ele).perform();
	}
}
