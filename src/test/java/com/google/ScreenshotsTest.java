package com.google;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotsTest {
	public static void captureScreen(WebDriver driver, String filename) throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+ filename +".png");
		FileUtils.copyFile(src, dest);
		
		//2nd way
		TakesScreenshot screen1 = (TakesScreenshot) driver;
		File src1 = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("./Screenshot"+filename+".png"));
		
		//3rd Way
		File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("./Screenshot"+filename+".png"));
	}
	
//	 // extent report
	
	public static String capture(WebDriver driver, String filename) throws IOException
	{
		String timestamp= new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
		String path= System.getProperty("user.dir")+"/target/Screenshots/" + filename +" "+ timestamp+ ".png";
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(path));
		return path;
	}
	
}
