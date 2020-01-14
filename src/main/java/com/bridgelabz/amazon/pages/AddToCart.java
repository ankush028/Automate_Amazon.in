package com.bridgelabz.amazon.pages;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bridgelabz.amazon.base.BaseClass;
import com.bridgelabz.amazon.util.Utility;

public class AddToCart extends BaseClass{

	public AddToCart() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=3']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple MacBook Pro (15-inch, Latest Model, 16GB RAM')]")
	WebElement selectItem;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addincart;
	
	public void addItem() throws InterruptedException {
		
		selectItem.click();
		Thread.sleep(2000);
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(Utility.pageNo));
		Thread.sleep(1000);
		Utility.scroll(0,200);
		addincart.click();
		Thread.sleep(5000);
						
	}
	
}
