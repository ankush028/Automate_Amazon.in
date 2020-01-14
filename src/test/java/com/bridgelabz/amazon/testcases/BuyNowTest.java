package com.bridgelabz.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.amazon.base.BaseClass;
import com.bridgelabz.amazon.pages.BuyNow;
import com.bridgelabz.amazon.pages.LoginPage;
import com.bridgelabz.amazon.pages.SearchItem;
import com.bridgelabz.amazon.util.CustomListener;


@Listeners(CustomListener.class)
public class BuyNowTest extends BaseClass{

	public SearchItem searchitem;
	public LoginPage login;
	public BuyNow buy;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initiation();
		login = new LoginPage();
		login.Login(property.getProperty("userid"),property.getProperty("pass"));
		searchitem = new SearchItem();
		searchitem.searchitem();
		buy = new BuyNow();
	}
	
	@Test
	public void buyNowTest() {
		buy.buyNow();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
