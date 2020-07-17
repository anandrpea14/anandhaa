package Tests_Scripts;

import org.testng.annotations.Test;

import Generic.Generic_ActiTime;
import POM.ActiTime_Login;
import POM.ActiTime_Logout;

public class ActiTime_Test extends Generic_ActiTime
{
	@Test
	public void test_login() throws InterruptedException
	{
		ActiTime_Login  lp = new ActiTime_Login (driver);
		Thread.sleep(5000);
		
		lp.setUsername("anand@gmail.com");
		Thread.sleep(3000);
		
		lp.setPassword("123456");
		Thread.sleep(3000);
		
		lp.clickLogin();
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		ActiTime_Logout ep = new ActiTime_Logout(driver);
		ep.clickLogout();
	}
}
