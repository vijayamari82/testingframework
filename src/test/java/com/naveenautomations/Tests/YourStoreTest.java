package com.naveenautomations.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveeenautomation.base.TestBase;
import com.naveenautomation.Pages.AccountLogin;
import com.naveenautomation.Pages.YourStorePage;

public class YourStoreTest extends TestBase {

YourStorePage yp;
AccountLogin accountLogin;

@BeforeMethod
public void startBorwserSession() {
	intialization();
	yp = new YourStorePage();
}

@Test()
public void testSomething() {
	yp.clickMyAccountBtn();
}

@AfterMethod
public void quitBrowserSession() {
	quitBrowser();
}

}

//public class YourStoreTest extends TestBase {
//YourStorePage yp;
//AccountLogin accountLogin;   
//
//
//@BeforeMethod
//public void startBrowserSession() {
//	intialization();
//	yp=new YourStorePage();
//}
//
//@Test
//
//public void testSomething() 
//{
//	yp.clickMyAccountBtn();
//}
//}
