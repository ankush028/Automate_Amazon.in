package com.bridgelabz.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.amazon.base.BaseClass;
import com.bridgelabz.amazon.pages.DeleteItemFromCart;
import com.bridgelabz.amazon.pages.LoginPage;
import com.bridgelabz.amazon.util.CustomListener;

@Listeners(CustomListener.class)
public class DeleteItemTest extends BaseClass {

	public LoginPage login;
	public DeleteItemFromCart deleteitem;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initiation();
		login = new LoginPage();
		login.Login(property.getProperty("userid"),property.getProperty("pass"));
		 deleteitem = new DeleteItemFromCart();
	}
	
	@Test
	public void deleteItem() throws InterruptedException {
		deleteitem.deleteItemFromCart();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
