package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveeenautomation.base.TestBase;

public class ProductiphonePage extends TestBase {
	
	public ProductiphonePage () {
		PageFactory.initElements(webDriver, this);
	}
	
	
//	@FindBy(css="#content > div:nth-child(3) > div:nth-child(2) > div > div:nth-child(2) > div.caption > h4 > a")
//	private WebElement iphone;
	
	@FindBy(css="#button-cart:nth-of-type(1)")
	private WebElement addtocart;
	
	
	@FindBy(css="#product-product > div.alert.alert-success.alert-dismissible")
	private WebElement productaddsuccessalert;

		
	@FindBy(css = "#cart-total")
	private WebElement cartTotalPrice;
	
	
	@FindBy(css="#top-links > ul > li:nth-child(5) > a > span")
	private WebElement checkoutbtn;
	
	
	
	public void clickAddToCart() {
		addtocart.click();
	}
	
	public String getSuccessText() {
	return productaddsuccessalert.getText();
	}
	
	public String getTotalPrice() {
		return "#cart-total";
	}
	
    public CheckOutPage checkOutButton() {
	checkoutbtn.click();
	return new CheckOutPage();
	
   
    }
    
    
//    @FindBy(css="#button-account")
//	private WebElement accountcontinue;
//	
//	@FindBy(id="input-payment-firstname")
//	private WebElement paymentfirstname;
//  		
//	@FindBy(id="#input-payment-lastname")
//	private WebElement paymentlastaname;
//	
//	@FindBy(id="#input-payment-email")
//	private WebElement paymentemail;
//	
//	
//	@FindBy(id="#input-payment-telephone")
//	private WebElement paymenttelephone;
//	
//	
//	@FindBy(id="#input-payment-password")
//	private WebElement paymentpassword;
//	
//	@FindBy(id="#input-payment-confirm")
//	private WebElement paymentconfirmpassword;
	
//	public void getFirstname()
//    {
//	paymentfirstname.sendKeys("nisha");
//    }
//
	
	
	

}
	

