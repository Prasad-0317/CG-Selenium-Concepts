package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
// soft assert doesnt throws exception it skips it. there is keyword
// hard assert throws exception , by default it is
public class AssertTest {
  @Test
  public void verifyLog() {
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  
	  String expectedTitle = "Swag Labs";
	  String actualTitle = driver.getTitle();
//	  Assert.assertEquals(actualTitle, expectedTitle, "Title mismatched"); // hard assert
	  
	  SoftAssert soft = new SoftAssert();
	  soft.assertEquals("wwww.google.com", driver.getCurrentUrl(),"URL is Wrong"); // pass
	  soft.assertAll(); // fail
  }
}
