package com.testng;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
// u can pass name or it will take object name, like screenshot we can use dp in different classes

public class DataTest {
//  @Test(dataProvider = "dp")
//  public void f(String user, String passwd) throws InterruptedException {
//	  	WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("Thread" + Thread.currentThread().getId());
//		driver.findElement(By.cssSelector("#user-name")).sendKeys(user);
//		driver.findElement(By.id("password")).sendKeys(passwd);
//		driver.findElement(By.id("login-button")).click();
//		Thread.sleep(2000);
//		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed(), "Logo not displayed");
//		driver.close();
//  }

  @DataProvider (parallel = true)
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },
      new Object[] {"error_user","secret_sauce"},
      new Object[] {"problem_user","secret_sauce"}
    };
  }
}
