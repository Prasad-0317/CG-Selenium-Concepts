package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class w3schools {

	public static void main(String[] args) {
		// exceptions
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_attributes_link");
//		driver.switchTo().frame(0); // give NoSuchElementException
		
		driver.switchTo().frame(1);
		
//		driver.switchTo().frame("iframeResult"); // Select a frame by its name or ID
		
//		WebElement anchor = driver.findElement(By.linkText("Visit W3Schools"));
//		anchor.click();
		
//		WebElement runbtn = driver.findElement(By.id("runbtn"));
		
//		WebElement anchor = driver.findElement(By.xpath("//a[text()='Visit W3Schools']"));
		
		WebElement anchor = driver.findElement(By.xpath("//a[text()='Visit W3School']"));
		anchor.click();

	}

}
