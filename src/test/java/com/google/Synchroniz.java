package com.google;

import java.time.Duration;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/* conditional syn = dynamic wait 
 * unconditional syn = static wait(Thread.sleep)
 * 
 * implicit wait - dynamic wait, global wait, it is applied to all elements when applied once
 * explicit wait - dynamic , web driver wait, create instance , applied for only particular element
 * fluent wait - dynamic wait, for particular element, can give maxtimeout 
 * 
*/ 

public class Synchroniz {
public static void main(String[] args) {
	
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.rediff.com/");
//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5)); // page load //	TimeoutException if more time req
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // implicit wait
	
	WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create Account']"));
	
	// Explicit Wait
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.elementToBeClickable(createAcc)).click();
	
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Create Account']"))).click(); // can use direct 
	
	// Fluent Wait
	Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(5))
			.withMessage("Fluent wait failed after giving 30 & polling 5 sec")
			.ignoring(NoSuchElementException.class);
	wait1.until(ExpectedConditions.visibilityOf(createAcc)).click();
	
}
}
