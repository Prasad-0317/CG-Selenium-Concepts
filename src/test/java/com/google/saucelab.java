package com.google;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class saucelab {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.saucedemo.com/");
//	WebElement userinp = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
//	userinp.sendKeys("standard_user");
//	WebElement pwdinp = driver.findElement(By.xpath("//*[@id='password']"));
//	pwdinp.sendKeys("secret_sauce");
//	WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
//	loginbtn.click();
//	Thread.sleep(2000);
//	
//	WebElement addtocart = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']"));
//	addtocart.click();
//	Thread.sleep(2000);
//	
//	WebElement shopcart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//	shopcart.click();
//	Thread.sleep(2000);
//	
//	WebElement removecart = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']"));
//	removecart.click();
//	Thread.sleep(2000);
//	
//	
//	WebElement continueShop = driver.findElement(By.xpath("//button[@id='continue-shopping']"));
//	continueShop.click();
//	Thread.sleep(3000);
//	
//	
//	WebElement menu = driver.findElement(By.xpath("//div[@class='bm-burger-button']"));
//	menu.click();
//	Thread.sleep(3000); // use wait instead of sleep
////	handling alerts 
//	
//	WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
//	logout.click();
	
//	WebElement logbtn = driver.findElement(By.id("login-button"));
//	logbtn.click();
//	System.out.println(logbtn.isDisplayed());
//	System.out.println(logbtn.isEnabled());
//	System.out.println(logbtn.isSelected());
//	WebElement error = driver.findElement(By.xpath("//div[@class=\"error-message-container error\"]/h3"));
//	System.out.println(error.getText());
	
	ScreenshotsTest.captureScreen(driver, "saucable");
}
}
