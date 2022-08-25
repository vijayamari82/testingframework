package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveeenautomation.base.TestBase;

public class OrderConfirmPage extends TestBase{
	
	public OrderConfirmPage() {
	PageFactory.initElements(webDriver, this);

	}
	
	@FindBy(css="#content > p:nth-child(2)")
	private WebElement Ordersuccess;
	
	public String finalpage()
	{
		String msg=Ordersuccess.getText();
		return msg;
	}
}
