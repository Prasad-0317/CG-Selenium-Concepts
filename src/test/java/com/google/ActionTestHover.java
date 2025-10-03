package com.google;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionTestHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.capgemini.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions action = new Actions(driver);
		
		WebElement cookies = driver.findElement(By.xpath("//button[text()='Accept']"));
//		action.moveToElement(cookies).click().build().perform();
//		
//		WebElement services = driver.findElement(By.xpath("//span[text()='Services']"));
//		action.moveToElement(services).perform(); // giving error org.openqa.selenium.ElementNotInteractableException:
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(cookies));
		action.moveToElement(cookies).click().build().perform();
		
		
		WebElement services = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Services']")));
		action.moveToElement(services).perform(); // timeoutexc
		
		
	}

}
