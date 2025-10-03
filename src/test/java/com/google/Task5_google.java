package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task5_google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
		WebElement searchip = driver.findElement(By.id("APjFqb"));
		searchip.sendKeys("Apple" + Keys.ENTER);
		Thread.sleep(3000);
		WebElement robotEle = driver.findElement(By.xpath("//span[@role='checkbox']")); // error: org.openqa.selenium.NoSuchElementException
		robotEle.click();

	}

}
