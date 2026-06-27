package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.Homepage;
import com.pages.loginPage;

@Listeners(DemoListener.class)
public class loginTest extends baseTest{

	
	 @Test(dataProvider = "validData", dataProviderClass = com.utile.ExcelUtility.class, priority = 1)
	public void loginPag(String name,String pass) {
		lpage= new loginPage(getDriver());
		lpage.login(name, pass);	
		
		hpage = new Homepage(getDriver());
		String wel = hpage.getWel();
		
		Assert.assertEquals(wel, "Welcome TamilKumar");
		System.out.println("login successful");
	}
	 
	 @Test(dataProvider = "invalidData", dataProviderClass = com.utile.ExcelUtility.class, priority = 2)
	 public void InvalidloginPag(String name,String pass) {

	     lpage = new loginPage(getDriver());
	     String alertMsg = lpage.loginInvalid(name, pass);

	     System.out.println("Alert: " + alertMsg);

	     Assert.assertTrue(alertMsg.contains("Wrong")); // or exact message
	 }

}
