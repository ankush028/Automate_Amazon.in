package com.bridgelabz.amazon.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.bridgelabz.amazon.base.BaseClass;


public class Utility extends BaseClass{

	public static final int pageload=20;
	public static final int wait =10;
	public static final int pageNo=1;
	public static Robot robot;
	public static JavascriptExecutor js ;
	
	public static void enter() {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void scroll(int start,int end) {
				js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+start+","+end+")");
	}
	
	public static void captureScreenShot(WebDriver driver,String screenshotName) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("/home/admin1/Desktop/JavaAdvanced/Amazon/ScreenShots/"+screenshotName+".png");
		try {
			FileUtils.copyFile(src,dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
