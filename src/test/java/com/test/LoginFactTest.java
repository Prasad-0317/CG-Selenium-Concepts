package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginFactoryPage;
import com.pages.LoginPage;
import com.pages.ShopCart;

public class LoginFactTest {
	WebDriver driver;
	LoginFactoryPage loginfact;
	HomePage homepage;
	ShopCart shopcart;
  @Test
  public void verifyLoginFact() throws InterruptedException {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  
	  loginfact = new LoginFactoryPage(driver);
	  loginfact.typeCred("problem_user","secret_sauce");
	  loginfact.clicklog();
	  
	  homepage = new HomePage(driver);
	  homepage.addProduct();
	  homepage.shoppingCart();
	  
	  shopcart = new ShopCart(driver);
	  shopcart.logOut();
	  
	  
	  
  }
}
