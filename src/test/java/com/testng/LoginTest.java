package com.testng;

import org.testng.annotations.Test;

import com.google.ScreenshotsTest;
import com.pages.LoginFactoryPage;
import com.setup.BaseSteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoginTest {
	WebDriver driver;
	Properties props;
	LoginFactoryPage loginfactPage;
	
@BeforeClass
  public void initBrowser() throws FileNotFoundException, IOException {
	driver = BaseSteps.chromedriver();
	loginfactPage = new LoginFactoryPage(driver);
	props = new Properties();
	props.load(new FileInputStream("src\\test\\java\\com\\objectRepo\\Object.properties"));
	loginfactPage.loadURL(props.getProperty("url"));
  }

//------------------ TestCase 1 -------------//
/*
 * Created By: Prasad
 * Reviewed by: SME name
 * Motive: To validate login with valid data
 */

  @Test (testName = "test1")
  public void verifyLogin1() throws IOException {
	  loginfactPage.typeCred(props.getProperty("uname"), props.getProperty("pwd"));
	  loginfactPage.clicklog();
	  Assert.assertEquals(loginfactPage.logoDisplay(), "Swag Labs");
	  ScreenshotsTest.captureScreen(driver, "test1");
  }
  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }
  

}
