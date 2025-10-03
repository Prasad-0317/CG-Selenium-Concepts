package com.google;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign1_Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/selenium/deprecated.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Switch to first frame and click the link
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.html5')]")).click();
		Thread.sleep(2000);

		// Switch back to default content before switching to another frame
		driver.switchTo().defaultContent();

		// Now switch to the second frame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[contains(text(),'ResultSetRows')]")).click();

	}

}
