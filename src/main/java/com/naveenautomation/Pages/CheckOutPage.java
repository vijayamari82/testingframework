package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveeenautomation.base.TestBase;

public class CheckOutPage extends TestBase{
	public CheckOutPage() {
		PageFactory.initElements(webDriver, this);
	}
	    @FindBy(css = "#collapse-checkout-option > div > div > div:nth-child(1) > div:nth-child(3) > label > input[type=radio]")
	    private WebElement registeraccount;
	 
		
		@FindBy(id="input-email")
		private WebElement checkoutemail;
		
		@FindBy(id="input-password")
		private WebElement checkoutpassword;
		
		@FindBy(css="#button-login")
		private WebElement checkoutloginbtn;
		
					
		@FindBy(css="#payment-existing > select")
		private WebElement custregisteredaddress;
		
		@FindBy(id="button-payment-address")
		private WebElement ckobillingcontinuebtn;
		
		@FindBy(css="#shipping-existing > select")
		private WebElement customershippingaddress;
		
		@FindBy(css="#collapse-shipping-address > div > form > div:nth-child(1) > label > input[type=radio]")
		private WebElement deliveryradiooption;
		
		@FindBy(css="#button-shipping-address")
		private WebElement deliverycontinuebtn;
		
	    @FindBy(css="#accordion > div:nth-child(4) > div.panel-heading > h4 > a")
	    private WebElement deliverymethodcolumn;
	    
	    
	    @FindBy(css="#button-shipping-method")
	    private WebElement deliverymethodbtn;
	    
	    @FindBy(css="#accordion > div:nth-child(5) > div.panel-heading > h4")
	    private WebElement paymentpaneltext;
	    
	    @FindBy(css="#collapse-payment-method > div > div.buttons > div > input[type=checkbox]:nth-child(2)")
	    private WebElement termconditionclick;
	    
	    @FindBy(css="#button-payment-method")
	    private WebElement paymentcontinuebtn;
	    
	    @FindBy(css="#accordion > div:nth-child(6) > div.panel-heading > h4 > a")
	    private WebElement confirmorderpanel;
	    
	    @FindBy(id="button-confirm")
	    private WebElement clickconfirmorderbtn;
	    
	    @FindBy(css="head > title")
	    private WebElement headtitle;
	    
	    
	    
	    
	 public void deliverymethodbtn()
	 {
		 deliverymethodbtn.click();
	 }
	    public void putemailaddress(String emailadd) { 
	    	checkoutemail.sendKeys(emailadd);
	    }
	    
	    public void putpassword(String passw) {
	    	checkoutpassword.sendKeys(passw);
	    	
	    }
	    
	    public PaymentPage checkOutLoginbtn() {
	    	checkoutloginbtn.click();
	    	return new PaymentPage();
	    	
	      }
	    
	    public void returningcustomer(String emailadd,String passw) {
	    putemailaddress(emailadd);
	    putpassword(passw);
	    checkOutLoginbtn();
	    }
	    
	    
	    public void billingaddress(String billaddress) {
	    	custregisteredaddress.sendKeys(billaddress);
	    	
	    }
	    
	    public void clickbillingbtn() {
	    	ckobillingcontinuebtn.click();
	    }
	   
	    public  void deliverymethodcolumn() {
	    	deliverymethodcolumn.click();
	    	    	
	      }
	    
	    public void shipcontinuebtn() {
	    	ckobillingcontinuebtn.click();
	    }
	  
	 
	    
	    public void deliverycontinuebtn() {
	    deliverycontinuebtn.click();	
	    	
	    }
	    
//	    public void acceptingterm() {
//	    termconditionclick.isEnabled();
//	    //termconditionclick.isSelected();
//	    }
	    public void paymentcontbtn() {
	    paymentcontinuebtn.click();
        }
	    
	    public void confirmorderbtn() {
	    clickconfirmorderbtn.click();
        }

		public void deliveryradiooption() {
			// TODO Auto-generated method stub
			deliveryradiooption.click();
		}
public void customershippingaddress(String address) {
	customershippingaddress.sendKeys(address);
	
	
}

public void clickterm() {
	termconditionclick.click();
}

}

