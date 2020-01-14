package com.bridgelabz.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bridgelabz.amazon.base.BaseClass;
import com.bridgelabz.amazon.pages.LoginPage;
import com.bridgelabz.amazon.util.CustomListener;

@Listeners(CustomListener.class)
public class LoginPageTest extends BaseClass{
	
	public LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() {
		initiation();
		loginPage = new LoginPage();
		
	}
	
	@Test(priority = 1)
	public void LoginTest(){
		
		loginPage.Login(property.getProperty("userid"),property.getProperty("pass"));
	}
	
	@Test(priority = 2)
	public void LoginPageTitle() {
		loginPage.Login(property.getProperty("userid"),property.getProperty("pass"));
		
		Assert.assertEquals(loginPage.loginPageTitle(),property.getProperty("title"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
