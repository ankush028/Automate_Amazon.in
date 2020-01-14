package com.bridgelabz.amazon.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.bridgelabz.amazon.util.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass{
	
		
	public static WebDriver driver;
	public static Properties property;
	public static WebDriverWait wait;
	public static FileInputStream fis;
		public BaseClass() 	{
			 
		
			property = new Properties();		
				try {
					fis = new FileInputStream("/home/admin1/Desktop/JavaAdvanced/Amazon/"
													+ "src/main/java/com/bridgelabz/amazon/config/config.properties");
					property.load(fis);
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
	
	public static void initiation() {
		
		if(property.getProperty("browser").equals("chrome")){
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else {			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
			
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utility.pageload,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utility.wait,TimeUnit.SECONDS);
		driver.get(property.getProperty("url"));
		wait = new WebDriverWait(driver,Utility.wait);
		
	}

}