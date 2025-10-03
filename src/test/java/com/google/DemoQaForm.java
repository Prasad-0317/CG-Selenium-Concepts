package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoQaForm {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	WebElement nameip = driver.findElement(By.id("firstName"));
	nameip.sendKeys("Prasad");
//	Thread.sleep(2000);
	
	WebElement lnameip = driver.findElement(By.id("lastName"));
	lnameip.sendKeys("Chaudhari");
//	Thread.sleep(2000);
	
	WebElement emailip = driver.findElement(By.id("userEmail"));
	emailip.sendKeys("abc@gmail.com");
//	Thread.sleep(2000);
	
//	WebElement genderip = driver.findElement(By.xpath("//input[@value='Male']"));
//	genderip.click(); // org.openqa.selenium.ElementClickInterceptedException
	
//	driver.findElement(By.id("gender-radio-1")).click(); error
	
	
	driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
	
	WebElement mobileip = driver.findElement(By.id("userNumber"));
	mobileip.sendKeys("9923758919");
	
	WebElement dobip = driver.findElement(By.id("dateOfBirthInput"));
	dobip.sendKeys(Keys.CONTROL + "a");
	dobip.sendKeys("17 Aug 2025");
	dobip.sendKeys(Keys.ENTER);

//	WebElement subjip = driver.findElement(By.id("subjectsContainer"));
//	subjip.sendKeys("Maths");  //  org.openqa.selenium.ElementNotInteractableException:
	
	WebElement subjip = driver.findElement(By.id("subjectsInput"));
	subjip.sendKeys("Maths");
	subjip.sendKeys(Keys.ENTER);
	
	WebElement hobbiesip = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
	if(!hobbiesip.isSelected()) {
		hobbiesip.click(); // org.openqa.selenium.ElementClickInterceptedException
	}
	
//	driver.findElement(By.id("uploadPicture")).sendKeys("\"C:\\Users\\prsadana\\Pictures\\Screenshots\\img.png\"");
//	org.openqa.selenium.InvalidArgumentException
	
	driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\prsadana\\Pictures\\Screenshots\\img.png");
	
	driver.findElement(By.id("currentAddress")).sendKeys("Dombivli");
	
	WebElement stateip = driver.findElement(By.id("react-select-3-input"));
	stateip.sendKeys("Uttar Pradesh");
	stateip.sendKeys(Keys.ENTER);
	
	WebElement cityip = driver.findElement(By.id("react-select-4-input"));
	cityip.sendKeys("Prayag");
	cityip.sendKeys(Keys.ENTER);
	
}
}
