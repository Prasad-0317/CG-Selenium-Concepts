package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

// difference btw build and perform 
//build to work command in sequence and it will compile code in sequence
// perform is to execute that compiled command, for execution, can use w/o build if only one command
// contextClick is rightclick

public class ActionTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.rediff.com/");
//	
//	Actions action = new Actions(driver);
//	WebElement accounttext = driver.findElement(By.xpath("//a[text()='Create Account']"));
////	action.click(accounttext).build().perform();
//	
//	action.moveToElement(accounttext).click().build().perform();
//	driver.navigate().back(); // write sleep to solve StaleElementexception
//	Thread.sleep(2000);
//	
//	// double click
//	action.moveToElement(accounttext).doubleClick().build().perform();
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	
//	action.doubleClick(accounttext).build().perform();
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	// right click
//	action.moveToElement(accounttext).contextClick().perform();
	
	
	driver.get("https://www.saucedemo.com/");
	Actions action = new Actions(driver);
	action.sendKeys(Keys.TAB).sendKeys("standard_user").build().perform();
	action.sendKeys(Keys.TAB).sendKeys("secret_sauce").build().perform();
	action.sendKeys(Keys.ENTER).build().perform();
	
}
}
