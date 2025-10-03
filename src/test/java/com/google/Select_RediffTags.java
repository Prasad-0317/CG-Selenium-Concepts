package com.google;

import java.lang.classfile.ClassFile.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_RediffTags {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
//	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
//	List<WebElement> selectele = driver.findElements(By.tagName("select"));
//	for(WebElement ele:selectele) {
//		System.out.println(ele.getText());
//	}
	
//	WebElement select = driver.findElement(By.cssSelector("#day"));
//	select[name*=DOB_Day] *  means contains, ^ starts with, $ ends with
//	Option typeOption : first, last, nth-of-type
	
//	select[name^=DOB_Day]>option:nth-of-type(5)
//	here > is closing tag 
//	WebElement select = driver.findElement(By.cssSelector("select[name^=DOB_Day]>option:nth-of-type(5)"));
	
//	WebElement dropdown = driver.findElement(By.cssSelector("select[name^=DOB_Day]"));
//	Select select = new Select(dropdown);
//	System.out.println(select.isMultiple());
//	select.selectByValue("03");
//	
//	WebElement country = driver.findElement(By.cssSelector("select[id=country]"));
//	Select select1 = new Select(country);
//	select1.selectByVisibleText("China");
//	
//	WebElement firstElement = select.getFirstSelectedOption();
//	System.out.println(firstElement.getAttribute("value"));
	
	// demo qa
	driver.get("https://demoqa.com/select-menu");
	WebElement dropdown = driver.findElement(By.cssSelector("select[id=cars]"));
	Select select = new Select(dropdown);
	select.selectByVisibleText("Saab");
	select.selectByIndex(2);
	
	List<WebElement> elements = select.getAllSelectedOptions();
	WebElement firstElement = select.getFirstSelectedOption();
	for(WebElement ele:elements) {
		System.out.println(ele.getText());
	}
	System.out.println(firstElement.getAttribute("value"));
	Thread.sleep(2000);
	select.deselectAll();
	
}
}
