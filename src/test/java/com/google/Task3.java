package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.capgemini.com/");
		driver.findElement(By.id("truste-consent-button")).click();
		WebElement services = driver.findElement(By.linkText("Services"));
		
//		WebElement services = driver.findElement(By.xpath("//span[text()='Services']")); error elementnotinteractable
		Actions action = new Actions(driver);
		
		action.moveToElement(services).perform();
		
	}

}
