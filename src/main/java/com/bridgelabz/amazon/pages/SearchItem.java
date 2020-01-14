package com.bridgelabz.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bridgelabz.amazon.base.BaseClass;
import com.bridgelabz.amazon.util.Utility;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class SearchItem extends BaseClass{


	public JavaScriptExecutor js;
	public SearchItem() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	
	
	public void searchitem(){
		search.clear();
		search.sendKeys(property.getProperty("search_item"));
		Utility.enter();
		Utility.scroll(0,1000);

	}
	
}
