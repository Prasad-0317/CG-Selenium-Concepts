package com.google;
// robots used element not interactable, stale exception
// robot comes under awt package not selenium

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RobotsTest {
public static void main(String[] args) throws AWTException {
	WebDriver driver = new EdgeDriver();
//	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	Robot robot = new Robot();
//	driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys("abcd");
//	
//	// select value
//	robot.keyPress(KeyEvent.VK_CONTROL);
//	robot.keyPress(KeyEvent.VK_A);
//	robot.keyRelease(KeyEvent.VK_CONTROL);
//	robot.keyRelease(KeyEvent.VK_A);
//	
//	// copy value
//	robot.keyPress(KeyEvent.VK_CONTROL);
//	robot.keyPress(KeyEvent.VK_C);
//	robot.keyRelease(KeyEvent.VK_CONTROL);
//	robot.keyRelease(KeyEvent.VK_A);
//	
//	// next 
//	robot.keyPress(KeyEvent.VK_TAB);
//	
//	robot.keyPress(KeyEvent.VK_CONTROL);
//	robot.keyPress(KeyEvent.VK_V);
//	robot.keyRelease(KeyEvent.VK_CONTROL);
//	robot.keyRelease(KeyEvent.VK_V);
	
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
	robot.mouseMove(580, 480);
	robot.delay(1000);
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	
}
}
