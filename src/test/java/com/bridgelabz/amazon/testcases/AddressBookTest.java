package com.bridgelabz.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.amazon.base.BaseClass;
import com.bridgelabz.amazon.pages.AddressBook;
import com.bridgelabz.amazon.pages.LoginPage;
import com.bridgelabz.amazon.util.CustomListener;


@Listeners(CustomListener.class)
public class AddressBookTest extends BaseClass{

	public LoginPage login;
	public AddressBook addressBook;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initiation();
		login = new LoginPage();
		login.Login(property.getProperty("userid"),property.getProperty("pass"));
		addressBook = new AddressBook();
	}
	
	@Test
	public void addressBookTest() throws InterruptedException {
		addressBook.addressBook();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
