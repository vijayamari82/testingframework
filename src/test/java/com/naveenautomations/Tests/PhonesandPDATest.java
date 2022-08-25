package com.naveenautomations.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveeenautomation.base.TestBase;
import com.naveenautomation.Pages.AccountLogin;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.Pages.PhonesandPDA;
import com.naveenautomation.Pages.YourStorePage;

public class PhonesandPDATest extends TestBase {

	YourStorePage yp;
    AccountLogin accountLogin;
    MyAccountPage myaccpage;
    PhonesandPDA phonepda;

	@BeforeMethod
	public void startBorwserSession() {
	
	intialization();
	yp=new YourStorePage();
	accountLogin=new AccountLogin();
	yp.clickMyAccountBtn();
	accountLogin=yp.clickloginBtn();
	myaccpage=accountLogin.clickSubmitBtn();
	myaccpage=accountLogin.checkloginsuccessful("priyaraman@gmail.com", "welcome@123");
	//phonepda=myaccpage.displayOfProducts();
	phonepda.ImageClickBtn();	
	}

	
	@Test  // I have doubt that we normally dont check the page chaining method, then why we are doing here for this to check whether image click is working or not
	
	public void checkImageClick() {
		phonepda.ImageClickBtn();
	}
	
	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}
	
	
}
