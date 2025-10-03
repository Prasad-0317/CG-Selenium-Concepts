package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.hc.core5.http.Method;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.ScreenshotsTest;
import com.pages.LoginFactoryPage;
import com.setup.BaseSteps;
import java.lang.reflect.*;

public class Reporting {
	WebDriver driver;
	Properties props;
	LoginFactoryPage loginfactPage;
	public static ExtentReports extent;
	public ExtentSparkReporter sparkReport;
	public ExtentTest test;
	
	@BeforeSuite
	public void reportGeneration() {
		sparkReport = new ExtentSparkReporter("target/Reports/TestReport.html");
		sparkReport.config().setTheme(Theme.DARK);
		sparkReport.config().setDocumentTitle("Automation Report");
		sparkReport.config().setReportName("Functional Testing");
		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
	}
	
	
	
	@BeforeClass
  public void initBrowser() throws FileNotFoundException, IOException {
	driver = BaseSteps.chromedriver();
	loginfactPage = new LoginFactoryPage(driver);
	props = new Properties();
	props.load(new FileInputStream("src\\test\\java\\com\\objectRepo\\Object.properties"));
	loginfactPage.loadURL(props.getProperty("url"));
  }

	@BeforeMethod
	public void reportCreation(java.lang.reflect.Method method) {
		test= extent.createTest("Test Name: "+method.getName());
	}

//------------------ TestCase 1 -------------//
/*
 * Created By: Prasad
 * Reviewed by: SME name
 * Motive: To validate login with valid data
 */

  @Test (testName = "test1")
  public void verifyLogin1() throws IOException {
	  test.info("verify Login");
	  loginfactPage.typeCred(props.getProperty("uname"), props.getProperty("pwd"));
	  loginfactPage.clicklog();
	  test.info("login is successful");
//	  Assert.assertEquals(loginfactPage.logoDisplay(), "Swag Labs");
//	  ScreenshotsTest.captureScreen(driver, "test1");
  }
  
  @Test (testName = "test2")
  public void verifyLogin2() throws IOException {
	  test.info("verify Login");
	  loginfactPage.typeCred(props.getProperty("uname"), props.getProperty("pwd"));
	  loginfactPage.clicklog();
	  test.info("login is successful");
//	  Assert.assertEquals(loginfactPage.logoDisplay(), "Swag Labs");
//	  ScreenshotsTest.captureScreen(driver, "test1");
  }
  
  @AfterMethod
  public void reportTestCompletion(ITestResult result) throws IOException{
	  String screenShotPath = ScreenshotsTest.capture(driver, result.getMethod().getMethodName());
	   if(result.getStatus() == ITestResult.SUCCESS) {
		   test.addScreenCaptureFromPath(screenShotPath);
		   test.pass("Test Passed");
	   }
	   else if(result.getStatus() == ITestResult.FAILURE) {
		   test.addScreenCaptureFromPath(screenShotPath);
		   test.fail("Test Failed" +result.getThrowable().getMessage());
	   }
	   else if(result.getStatus() == ITestResult.SKIP) {
		   test.addScreenCaptureFromPath(screenShotPath);
		   test.skip("Test Skipped" +result.getThrowable().getMessage());
	   }
  }
  
  @AfterTest
  public void cleanUp() {
	 BaseSteps.tearDown();
  }
  
  
  @AfterSuite
  public void reportCompletion() {
	  extent.flush();
  }

}
