package com.naveenautomations.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveeenautomation.base.TestBase;
import com.naveenautomation.Pages.YourStorePage;

public class YourStoreTest extends TestBase {

YourStorePage yp;
//AccountLogin accountLogin;  // an object is been created for the next page account login

@BeforeMethod
public void startBorwserSession() {
	intialization();
	yp = new YourStorePage(); // initialization of the object yp for the Your Store Page  is done here
}


// here why we are not testing for clicklogin function

@Test
public void testSomething()
{
	yp.clickMyAccountBtn();
}


@AfterMethod
public void quitBrowserSession() {
	quitBrowser();
}

}

