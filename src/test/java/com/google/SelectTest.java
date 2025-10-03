package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new EdgeDriver();
//		driver.get("https://google.com"); // get is selenium webdriver method
//		WebElement images = driver.findElement(By.linkText("Images"));
//		images.click();
		
		driver.navigate().to("https://www.google.com"); // browser navigation methods 
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
