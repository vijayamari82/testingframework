package com.naveenautomations.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveeenautomation.base.TestBase;
import com.naveenautomation.Pages.AccountLogin;
import com.naveenautomation.Pages.CheckOutPage;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.Pages.YourStorePage;

public class MyAccountTest extends TestBase{
	YourStorePage yp;
    AccountLogin accountLogin;
    MyAccountPage myaccpage;
    CheckOutPage checkoutpage;
    
	@BeforeMethod
	public void startBorwserSession() {
	
	intialization();
	yp=new YourStorePage();
	accountLogin=new AccountLogin();
	
	yp.clickMyAccountBtn();
	accountLogin=yp.clickloginBtn();
    accountLogin.clickSubmitBtn();
	accountLogin.checkloginsuccessful("priyaraman@gmail.com", "welcome@123");

	
}

	
@Test

public void checkforProductsDisplayPage() throws InterruptedException {
	/*MyAccountPage MyaccPage=new MyAccountPage();
    MyaccPage.selectPhoneandPda();
    MyaccPage.productselection();
    MyaccPage.addcart();*/
  //  MyAccountPage myaccpage=new MyAccountPage();
	
myaccpage=new MyAccountPage();
accountLogin=new AccountLogin();
checkoutpage=new CheckOutPage();
myaccpage.itemtocart();
myaccpage.checkOutBtn();
//checkoutpage.returningcustomer("priyamohan@gmail.com", "welcome@123");
//checkoutpage.clickbillingbtn();
////checkoutpage.deliveryradiooption();
//checkoutpage.customershippingaddress("Priya Mohan, 1580 caroline street, Toronto, Ontario, Canada");
//checkoutpage.deliverycontinuebtn();
//checkoutpage.paymentcontbtn();
//checkoutpage.acceptingterm();
//Thread.sleep(30000);
}


@AfterMethod
public void quitBrowserSession() {
	quitBrowser();
}

}

