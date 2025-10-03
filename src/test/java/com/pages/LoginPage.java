package com.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	
	// Web Elements
	By username = By.id("user-name");
	By password = By.cssSelector("#password");
	By loginbtn = By.xpath("//input[@data-test='login-button']");
	
	public LoginPage(WebDriver driver) {
//		this.driver = driver;
		super(driver);
	}
	
	public void typeData(String user, String pass) {
		// you can give by proprtyfile
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		
	}
	public void typeData() {
		driver.findElement(username).sendKeys("problem_user");
		driver.findElement(password).sendKeys("secret_sauce");
	}
	public void clickBtn() {
		driver.findElement(loginbtn).click();
	}
}
