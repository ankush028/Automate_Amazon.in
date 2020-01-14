package com.bridgelabz.amazon.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.amazon.base.BaseClass;
import com.bridgelabz.amazon.util.Utility;

public class BuyNow extends BaseClass{

	public BuyNow(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=3']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple MacBook Pro (15-inch, Latest Model, 16GB RAM')]")
	WebElement selectItem;
	
	@FindBy(xpath = "//input[@id='buy-now-button']")
	WebElement buyNow;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signin;
	
	public void buyNow() {
		selectItem.click();
		List<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(Utility.pageNo));

		buyNow.click();

	}
	
}
