package com.bridgelabz.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bridgelabz.amazon.base.BaseClass;
import com.bridgelabz.amazon.pages.LoginPage;
import com.bridgelabz.amazon.pages.SearchItem;
import com.bridgelabz.amazon.util.CustomListener;


@Listeners(CustomListener.class)
public class SearchItemTest extends BaseClass{

	SearchItem searchitem;
	LoginPage login;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initiation();
		searchitem = new SearchItem();
		login = new LoginPage();
		login.Login(property.getProperty("userid"),property.getProperty("pass"));
	}
	
	@Test
	public void searchItenTest(){
		searchitem.searchitem();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
