package com.bridgelabz.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.amazon.base.BaseClass;
import com.bridgelabz.amazon.pages.AddToCart;
import com.bridgelabz.amazon.pages.LoginPage;
import com.bridgelabz.amazon.pages.SearchItem;
import com.bridgelabz.amazon.util.CustomListener;


@Listeners(CustomListener.class)
public class AddToCartTest extends BaseClass{

	public AddToCartTest() {
		super();
	}
	
	
	public SearchItem searchitem;
	public LoginPage login;
	public AddToCart addToCart;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initiation();
		login = new LoginPage();
		login.Login(property.getProperty("userid"),property.getProperty("pass"));
		searchitem = new SearchItem();
		searchitem.searchitem();
		addToCart = new AddToCart();
	}
	
	@Test
	public void addItemInCart() throws InterruptedException {

		addToCart.addItem();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
