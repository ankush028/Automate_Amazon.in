package com.bridgelabz.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.bridgelabz.amazon.base.BaseClass;


public class AddressBook extends BaseClass{

	public AddressBook() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@class='nav-a nav-a-2 a-popover-trigger a-declarative']")
	WebElement deliveryAddress;
	
	@FindBy(xpath = "//a[contains(text(),'Manage address book')]")
	WebElement manageAddress;
	
	@FindBy(xpath = "//div[@id='ya-myab-plus-address-icon']")
	WebElement addNewAddress;
	
	@FindBy(xpath = "//select[@name='address-ui-widgets-countryCode']")
	WebElement selectCountry;
	
	@FindBy(xpath = "//a[contains(text(),'Buy Again')]")
	WebElement buyAgain;
	
	@FindBy(xpath = "//a[@id='address-ui-widgets-countryCode-dropdown-nativeId_102']")
	WebElement find;
	
	
	public void addressBook() throws InterruptedException {
		buyAgain.click();
		Thread.sleep(2000);
		deliveryAddress.click();
		Thread.sleep(2000);
		manageAddress.click();
		Thread.sleep(2000);
		addNewAddress.click();
		Thread.sleep(2000);
		Select select = new Select(selectCountry);
		select.selectByVisibleText("Indonesia");
		find.click();
		Thread.sleep(3000);
		
	}
	
	
	
}
