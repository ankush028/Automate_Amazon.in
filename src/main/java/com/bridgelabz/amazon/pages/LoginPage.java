package com.bridgelabz.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.amazon.base.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage() {
		
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath = "//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath ="//input[@id='continue']")
	WebElement emailnext;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signin;
	
	public void Login(String emailid,String pass) {
		
		email.sendKeys(emailid);
		emailnext.click();
		password.sendKeys(pass);
		signin.click();

	}
	
	public String loginPageTitle() {
		
		return driver.getTitle();
		
	}
}
