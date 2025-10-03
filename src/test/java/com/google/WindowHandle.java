package com.google;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.magicbricks.com/");
		Actions action = new Actions(driver);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
		action.moveToElement(help).build().perform();
		
		Thread.sleep(2000);
		
		WebElement helpcenter = driver.findElement(By.xpath("//a[text()='Help Center']"));
//		action.moveToElement(helpcenter).click().build().perform(); // NOTE: dont move give error sometimes bcoz cursor moves
		
		helpcenter.click(); 
		Thread.sleep(2000);
		
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindow);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
	}

}
