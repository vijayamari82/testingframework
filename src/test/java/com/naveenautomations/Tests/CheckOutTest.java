package com.naveenautomations.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveeenautomation.base.TestBase;
import com.naveenautomation.Pages.AccountLogin;
import com.naveenautomation.Pages.CheckOutPage;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.Pages.OrderConfirmPage;
import com.naveenautomation.Pages.YourStorePage;
public class CheckOutTest extends TestBase{

YourStorePage yp;
    AccountLogin accountLogin;
    MyAccountPage myaccpage;
    CheckOutPage checkoutpage;
    
	@BeforeMethod
	public void startBorwserSession() {
	
	intialization();
	yp=new YourStorePage();
	accountLogin=new AccountLogin();
	myaccpage=new MyAccountPage();
	yp.clickMyAccountBtn();
	accountLogin=yp.clickloginBtn();
    accountLogin.clickSubmitBtn();
	accountLogin.checkloginsuccessful("priyaraman@gmail.com", "welcome@123");
	
accountLogin=new AccountLogin();
checkoutpage=new CheckOutPage();
myaccpage.itemtocart();
//myaccpage.checkOutBtn();
}
	

	
@Test

public void checkforProductsDisplayPage() throws InterruptedException {
		
CheckOutPage checkoutpage=new CheckOutPage();
checkoutpage.returningcustomer("priyamohan@gmail.com", "welcome@123");
checkoutpage.clickbillingbtn();
//checkoutpage.deliveryradiooption();
checkoutpage.customershippingaddress("Priya Mohan, 1580 caroline street, Toronto, Ontario, Canada");
checkoutpage.deliverycontinuebtn();
checkoutpage.deliverymethodbtn();
checkoutpage.clickterm();
checkoutpage.paymentcontbtn();

checkoutpage.confirmorderbtn();
//checkoutpage.acceptingterm();
OrderConfirmPage orderconfirm=new OrderConfirmPage();
String expected=orderconfirm.finalpage();//
String ordersuccess="Your order has been successfully processed!";
Assert.assertEquals(expected,ordersuccess);
Thread.sleep(30000);
System.out.println("Test pass");

}


@AfterMethod
public void quitBrowserSession() {
	quitBrowser();
}

}



/*MyAccountPage MyaccPage=new MyAccountPage();
MyaccPage.selectPhoneandPda();
MyaccPage.productselection();
MyaccPage.addcart();*/
//  MyAccountPage myaccpage=new MyAccountPage();
