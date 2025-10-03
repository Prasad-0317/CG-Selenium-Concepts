package com.google;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions action = new Actions(driver);
		
//		WebElement source = driver.findElement(By.id("draggable"));
		
//		WebElement dest = driver.findElement(By.cssSelector("#droppable")); // no such element exception error
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		action.dragAndDrop(source, dest).build().perform();
		if(dest.getText().matches("Dropped!")) {
			System.out.println("Done..");
		}
		
	}

}
