package com.google;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class GHPLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
//		System.out.println("Which browser ?");
		
//		String browser = sc.nextLine();
		WebDriver driver = null;
//		switch(browser.toLowerCase()) {
//		case "edge":
//			driver = new EdgeDriver();
//			break;
//		case "chrome":
//			driver = new ChromeDriver();
//			break;
//		default:
//			driver = new EdgeDriver();
//			break;
//		}
		driver = new EdgeDriver();
//		driver.get("https://www.google.com");
		
//		WebElement searchinput = driver.findElement(By.id("APjFqb"));
//		searchinput.sendKeys("selenium");
//		searchinput.sendKeys(Keys.ENTER);
//		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
//		driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		
//		List<WebElement> anchortags = driver.findElements(By.tagName("a"));
//		System.out.println("Count :" + anchortags.size());
//		
//		for(WebElement tag:anchortags) {
//			System.out.println(tag.getText());
//			System.out.println(tag.getAttribute("href"));
//		}
//		WebElement searchinput = driver.findElement(By.className("gLFyf"));
//		searchinput.sendKeys("selenium");
//		WebElement imageslink = driver.findElement(By.linkText("Images"));
//		imageslink.click();
//		System.out.println(driver.getTitle());
//		if(driver.getTitle().contains("Images") && (driver.getCurrentUrl().contains("imghp"))) {
//			System.out.println("Image page loaded");
//		}
//		else {
//			System.out.println("Img page did not loaded");
//		}
		
//		WebElement searchinput = driver.findElement(By.cssSelector("div+textarea"));
//		searchinput.sendKeys("selenium");
		
		// X-PATH
		
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		
//		WebElement uninp = driver.findElement(By.xpath("//input[@name='uid']"));
//		uninp.sendKeys("rajesh");
//		WebElement pwdinp = driver.findElement(By.xpath("//input[@type='password']"));
//		pwdinp.sendKeys("abc123@");
		
		/* //input[contains(@name,'btn')] --> return first button 
		//td[text()='UserID'] */
		
//		WebElement loginbtn = driver.findElement(By.xpath("//input[contains(@name,'btn')]"));
//		loginbtn.click();
		
//		WebElement uidlbl = driver.findElement(By.xpath("//td[text()='UserID']"));
//		System.out.println(uidlbl.getText());
//		
//		uninp.sendKeys("rajesh");
//		pwdinp.sendKeys("abc123@");
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		WebElement resetbtn = driver.findElement(By.xpath("//input[@type='reset' and @value='RESET']"));
//		resetbtn.click();
//		
//		List<WebElement> buttons = driver.findElements(By.xpath("//input[starts-with(@name,'btn')]"));
//		System.out.println(buttons.size());
		
		WebElement uidinp = driver.findElement(By.xpath("//input[@name='uid']"));
		WebElement pwdinp = driver.findElement(RelativeLocator.with(By.name("password")).below(uidinp));
		pwdinp.sendKeys("abc123@");
	}

}
