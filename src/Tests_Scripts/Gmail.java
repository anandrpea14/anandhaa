package Tests_Scripts;

import org.testng.annotations.Test;
import Generic.Generic_Gmail;
import POM.Gmail_Login;
import POM.Gmail_Logout;

public class Gmail extends Generic_Gmail
{
	@Test 
	public void test_login() throws InterruptedException 
	{	
		Gmail_Login lp =new Gmail_Login (driver); 
		Thread.sleep(5000);
		
		lp.setUsername("anand.rpea14@gmail.com");
		Thread.sleep(3000);
		
		lp.nextLogin();   
		Thread.sleep(5000);
		
		lp.setPassword("HARI@123");   
		Thread.sleep(3000);
		
		lp.clickLogin();
		Thread.sleep(15000);
		
		Gmail_Logout ep = new Gmail_Logout(driver);
		
		ep.ClickGooAcco();
		
		Thread.sleep(2000);
		ep.ClickLogout();
	}
}
