package com.bridgelabz.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bridgelabz.amazon.base.BaseClass;

public class DeleteItemFromCart extends BaseClass{

	public DeleteItemFromCart() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@id='nav-cart']") 
	WebElement cart;
	
	@FindBy(xpath = "//input[@value='Delete']")
	WebElement deleteItem;
	
	@FindBy(xpath = "//a[contains(text(),'Buy Again')]")
	WebElement buyagain;
	
	public void deleteItemFromCart() throws InterruptedException {
		cart.click();
//		Thread.sleep(2000);
		deleteItem.click();
//		Thread.sleep(2000);
		buyagain.click();
//		Thread.sleep(3000);
	}

}
