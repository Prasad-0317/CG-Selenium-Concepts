package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//public void verifyTest(@Optional("standard_user") String user,@Optional("secret_sauce") String passwd)

public class ParameterTest {
	
//	@BeforeTest
//	public void initBrowser() {
//		driver= new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//	}
//  @Parameters({"user","passwd"})
//  @Test (timeOut = 1000, expectedExceptions = {NoSuchElementException.class}, threadPoolSize = 2, invocationCount = 5) // threadpoolsize and invocation should both be there
  @Test ( dataProvider = "dp",dataProviderClass = DataTest.class)
  public void verifyTest(String user, String passwd) throws InterruptedException {// u can pass optional value 
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/"); 
	  driver.findElement(By.id("user-name")).sendKeys(user);
		 Thread.sleep(500);
		  driver.findElement(By.id("password")).sendKeys(passwd);
		  Thread.sleep(500);
		  driver.findElement(By.id("login-button")).click();
		  Thread.sleep(2000);
		  Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed(), "Logo not displayed");
		  driver.close();
//		  Assert.assertTrue(true);
		  
//		  Assert.assertTrue(false); // if written will pass error and go to next test parameter to test
		  // The test will always pass, regardless of whether the login was successful or not
		  
//		  Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Login failed or did not redirect properly.");

  }
//	@AfterTest
//	  public void tearDown()
//	  {
//		  driver.close();
//	  }
}

//Test block Test:
//
//No <class> specified → no test executed.
//But TestNG still counts it as part of the suite structure.
//Test block Test1:
//
//Runs ParameterTest with user = error_user.
//Executes verifyTest() method.
//Hits Assert.assertTrue(false); → test fails.
//Final Output:
//
//Only 1 test method was run (from Test1).
//It failed.
