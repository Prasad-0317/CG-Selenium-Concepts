package com.google;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AlertsTest {
public static void main(String[] args) throws AWTException {
	WebDriver driver = new EdgeDriver();
//	driver.get("https://demoqa.com/alerts");
//	Robot robot = new Robot();
	//  org.openqa.selenium.ElementClickInterceptedException: as only upper side visible
	
	// 1
	
//	robot.keyPress(KeyEvent.VK_DOWN);
//	robot.mouseWheel(5);
//	driver.findElement(By.id("alertButton")).click();
//	System.out.println(driver.switchTo().alert().getText());
//	driver.switchTo().alert().accept();
	
	// 2
//	driver.findElement(By.id("timerAlertButton")).click();
//	robot.delay(5050);
//	System.out.println(driver.switchTo().alert().getText()); 	// as 5 sec delay given then error org.openqa.selenium.NoAlertPresentException: 
//	driver.switchTo().alert().accept();

	// 3
//	driver.findElement(By.id("confirmButton")).click();
//	robot.delay(2000);
//	System.out.println(driver.switchTo().alert().getText());
//	driver.switchTo().alert().dismiss();
	
	// 4
//	driver.findElement(By.id("promtButton")).click();
//	robot.delay(1000);
//	System.out.println(driver.switchTo().alert().getText());
//	driver.switchTo().alert().sendKeys("abc");
//	driver.switchTo().alert().accept();
	
	driver.get("https://www.rediff.com/");
	driver.switchTo().frame("moneyiframe");
	driver.findElement(By.xpath("//input[@id='query']")).sendKeys("motilal");
	driver.findElement(By.cssSelector(".getqbtn")).click();
}
}
