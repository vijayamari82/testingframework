package com.naveenautomations.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveeenautomation.base.TestBase;
import com.naveenautomation.Pages.AccountLogin;
import com.naveenautomation.Pages.YourStorePage;

public class AccountLoginTest extends TestBase {
	
	YourStorePage yp;
    AccountLogin accountLogin;

	@BeforeMethod
	public void startBorwserSession() {
	intialization();
	yp=new YourStorePage();
	yp.clickMyAccountBtn();
	accountLogin=yp.clickloginBtn();
	}

	@Test
	public void verifyCustomerLogin() {
		
		accountLogin.checkloginsuccessful("priyaraman@gmail.com", "welcome@123");
		
//		MyAccountPage map = accountLogin.login("user10@gmail.com", "Qwerty123");
//		Assert.assertEquals(map.getTextFromMyAccount(), "My Account");
	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}

}
	 	
