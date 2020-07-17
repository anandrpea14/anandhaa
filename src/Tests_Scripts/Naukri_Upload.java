package Tests_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_Upload 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty ("webdriver.gecko.driver","./Software/geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#usernameField")).sendKeys("anandhakrishnanvel@gmail.com");
		System.out.println("Entered User Name Sucessfully");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#passwordField")).sendKeys("vijayanthi");
		System.out.println("Entered Password Sucessfully");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Login']")).click();
		System.out.println("Naukri Login Sucessfully");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\admin\\Desktop\\ANAND_RESUME.pdf");
		System.out.println("Resume Uploaded");
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//div[.='My Naukri']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Thread.sleep(7000);
		System.out.println("Done...");
		
		driver.quit();
	}
}
