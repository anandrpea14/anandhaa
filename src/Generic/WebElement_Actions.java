package Generic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class WebElement_Actions 
{
	public static void Click(WebElement ele) // 1
	{
		ele.click();
	}
	public static void Clear(WebElement ele) // 2
	{
		ele.clear();
	}
	public static void SendKeys(WebElement ele,String url) // 3
	{
		ele.sendKeys(url);
	}
	public static void Attributes(WebElement ele,String A1) // 4
	{
		String Attri = ele.getAttribute(A1);
		System.out.println(Attri);
	}
	public static void CssValue(WebElement ele, String Value) // 5
	{
		String Css = ele.getCssValue(Value);
		System.out.println(Css);
	}
	public static void Location(WebElement ele) // 6
	{
		Point Loc = ele.getLocation();
		System.out.println(Loc);
	}
	public static void Rect(WebElement ele) // 7
	{
		ele.getRect();
		
	}
	public static void Size(WebElement ele) // 8
	{
		Dimension size = ele.getSize();
		System.out.println(size);
	}
	public static void TagName(WebElement ele) // 9
	{
		String Tag = ele.getTagName();
		System.out.println(Tag);
	}
	public static void Text(WebElement ele) // 10
	{
		String text = ele.getText();
		System.out.println(text);
	}
	public static void Displayed(WebElement ele) // 11
	{
		boolean disp = ele.isDisplayed();
		System.out.println(disp);
	}
	public static void Enabled(WebElement ele) // 12
	{
		boolean multi = ele.isEnabled();
		System.out.println(multi);
	}
	public static void Selected(WebElement ele) // 13
	{
		boolean selec = ele.isSelected();
		System.out.println(selec);
	}
	public static void Submit(WebElement ele) // 14
	{
		ele.submit();
	}
}
