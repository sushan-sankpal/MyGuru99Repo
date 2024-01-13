package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass_Guru99;

public class UtilsClass extends BaseClass_Guru99 {
	
	public static void sendKeys(WebElement wb1, String var1)
	{
		wb1.sendKeys(var1);
	}
	
	public static void tekeScreenShotMethodSuccess() throws IOException
	{
		
		SimpleDateFormat simple = new SimpleDateFormat("ddMMyyyy_HHmmss");
		String date = simple.format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(System.getProperty("user.dir")+"\\AllDrivers\\PassScreenShots\\guru_"+date+".png");
		FileUtils.copyFile(src, dst);
	}
	
	public static void tekeScreenShotMethodFailed() throws IOException
	{
		
		SimpleDateFormat simple = new SimpleDateFormat("ddMMyyyy_HHmmss");
		String date = simple.format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(System.getProperty("user.dir")+"\\AllDrivers\\FailedScreenShots\\guru_"+date+".png");
		FileUtils.copyFile(src, dst);
	}
	
	public static String getURL()
	{
		return driver.getCurrentUrl();
	}
	
	public static String getTitle()
	{
		return driver.getTitle();
	}
}
