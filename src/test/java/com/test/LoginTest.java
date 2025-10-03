package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage log;
  @Test
  public void verifyLogin() {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  
	  log = new LoginPage(driver);
	  log.typeData("problem_user","secret_sauce");
	  log.clickBtn();
  }
}
