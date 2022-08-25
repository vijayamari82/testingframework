package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveeenautomation.base.TestBase;

public class PaymentPage extends TestBase {
	public PaymentPage()
	{
		PageFactory.initElements(webDriver, this);

	}
	@FindBy(css="#payment-existing > select")
	private WebElement custregisteredaddress;
	
	@FindBy(id="button-payment-address")
	private WebElement ckobillingcontinuebtn;
	
	@FindBy(css="#shipping-existing > select")
	private WebElement customershippingaddress;
	
	@FindBy(id="button-payment-address")
	private WebElement Fianldeliverycontinuebtn;
	
    @FindBy(css="#accordion > div:nth-child(4) > div.panel-heading > h4 > a")
    private WebElement deliverymethodtext;
    
    @FindBy(css="#button-shipping-method")
    private WebElement shippingcontinuebtn;
    
    @FindBy(css="#accordion > div:nth-child(5) > div.panel-heading > h4")
    private WebElement paymentpaneltext;
    
    @FindBy(css="input[type=checkbox]:nth-child(2)")
    private WebElement termconditionclick;
    
    @FindBy(css="#button-payment-method")
    private WebElement paymentcontinuebtn;
    
    @FindBy(css="#accordion > div:nth-child(6) > div.panel-heading > h4 > a")
    private WebElement confirmorderpanel;
    
    @FindBy(id="button-confirm")
    private WebElement clickconfirmorderbtn;
    
    @FindBy(css="head > title")
    private WebElement headtitle;
public void selectadd()
{
	custregisteredaddress.click();
}
public void paymentdetails()
{
	selectadd();
}
}
