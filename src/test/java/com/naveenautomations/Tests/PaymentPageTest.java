package com.naveenautomations.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveeenautomation.base.TestBase;
import com.naveenautomation.Pages.AccountLogin;
import com.naveenautomation.Pages.CheckOutPage;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.Pages.PaymentPage;
import com.naveenautomation.Pages.YourStorePage;

public class PaymentPageTest extends TestBase {
	YourStorePage yp;
    AccountLogin accountLogin;
    MyAccountPage myaccpage;
    CheckOutPage checkoutpage;
    
	@BeforeMethod
	public void startBorwserSession() {
	
	intialization();
	yp=new YourStorePage();
	accountLogin=new AccountLogin();
	checkoutpage=new CheckOutPage();
	yp.clickMyAccountBtn();
	accountLogin=yp.clickloginBtn();
    accountLogin.clickSubmitBtn();
	accountLogin.checkloginsuccessful("priyamohan@gmail.com", "welcome@123");

	}
	@Test
	public void paymentTest()
	{
		PaymentPage paymentpage=new PaymentPage();
		paymentpage.paymentdetails();
	}
}
