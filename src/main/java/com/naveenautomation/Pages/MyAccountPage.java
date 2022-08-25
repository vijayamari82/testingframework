package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveeenautomation.base.TestBase;

public class MyAccountPage extends TestBase {
	
	public MyAccountPage() {
		PageFactory.initElements(webDriver, this);
	}

	
	@FindBy(css="#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(6) > a")
	private WebElement PhonePDA;
	
	
	@FindBy(css="#content > div:nth-child(3) > div:nth-child(2) > div > div:nth-child(2) > div.caption > h4 > a")
	private WebElement iphone;
	
	@FindBy(css="#button-cart")
	private WebElement addtocart;
		
	@FindBy(css="#product-product > div.alert.alert-success.alert-dismissible")
	private WebElement productaddsuccessalert;

	@FindBy(css = "#cart-total")
	private WebElement productPriceAddedToCart;
	
	@FindBy(css="#top-links > ul > li:nth-child(5) > a > span")
	private WebElement checkout;
	
	
public void selectPhoneandPda(){
	PhonePDA.click();
}

public void productselection() {
	iphone.click();
}

public void  addProductToCart() {

addtocart.click();
	
}

public String totalPrice() {
return productPriceAddedToCart.getText();
}


//public void getSuccessText1() {
//	System.out.println(productaddsuccessalert.getText());
//}

public String getSuccessText() {
	return productaddsuccessalert.getText();
}


public CheckOutPage checkOutBtn() {
	checkout.click();
	return new CheckOutPage();
	
}

//public CheckOutPage addcart() {
//	addtocart.click();
//	return new CheckOutPage();
	

public CheckOutPage itemtocart() {
selectPhoneandPda();
productselection();
addProductToCart();
totalPrice();
getSuccessText();
return checkOutBtn();

//addcart();
//getSuccessText1(); // This will show the result in console
	
}

}


