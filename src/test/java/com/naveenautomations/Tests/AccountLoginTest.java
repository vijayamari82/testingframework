package com.naveenautomations.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveeenautomation.base.TestBase;
import com.naveenautomation.Pages.AccountLogin;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.Pages.YourStorePage;

public class AccountLoginTest extends TestBase {
	
		YourStorePage yp;
		AccountLogin accountLogin;

		@BeforeMethod
		public void browsersession() {
			intialization();
			
			yp = new YourStorePage();
			yp.clickMyAccountBtn();
			accountLogin = yp.clickloginBtn();
			
//			yp.clickMyAccountBtn();
//			yp.clickloginBtn();
//			accountLogin = yp.clickloginBtn();
//			accountLogin=new AccountLogin();
			
		}
			
	 	
		@Test
		public void verifyCustomerLogin() {
			MyAccountPage map = accountLogin.login("priyamohan@gmail.com", "welcome@123");
			//Assert.assertEquals(map.getTextFromMyAccount(), "myaccountText");
		}

		@AfterMethod
		public void quitBrowserSession() {
			quitBrowser();
		}

	}
	
//YourStorePage yp;
//AccountLogin accountLogin;
//
//	@BeforeMethod
//	public void startBrowserSession() {
//		intialization();
//		yp = new YourStorePage();
//		yp.clickMyAccountBtn();
//		//yp.clickloginBtn();
//		accountLogin = yp.clickloginBtn();
//		//accountLogin=new AccountLogin();
// }
//
//@Test
//
//public void test1() 
//{
//
//	AccountLoginTest.login("priyamohan@gmail.com","welcome@123");
//}
// 
//
//private static void login(String string, String string2) {
//	// TODO Auto-generated method stub
//	
//}
//
//@AfterMethod
//public void quitBrowserSession()
//{
//	
//quitBrowser();
//}
//}