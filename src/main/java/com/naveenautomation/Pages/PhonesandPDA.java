package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveeenautomation.base.TestBase;

public class PhonesandPDA extends TestBase{
	
	
	public PhonesandPDA() {
		
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(css="#content > div:nth-child(3) > div:nth-child(2) > div > div.image > a > img")
	private WebElement iphoneImage;
	
	
	public   ProductiphonePage ImageClickBtn() {
	iphoneImage.click();
	return new ProductiphonePage();
	}
		
	
	
}
