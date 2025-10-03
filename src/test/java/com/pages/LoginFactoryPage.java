package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFactoryPage extends BasePage{
//	WebDriver driver;
	
	@FindBy(id = "user-name")	WebElement username;
	@FindBy(xpath = "//input[@data-test='password']")	WebElement password;
	@FindBy(id="login-button")	WebElement loginbtn;
	@FindBy(className = "app_logo") WebElement logoElement;
	
	
//	@FindBy(how = How.ID, using = "user-name") WebElement uname;
	
//	@FindBys({
//		@FindBy(id = "user-name"),
//		@FindBy(name="user-name")
//	}) WebElement unameElement; // AND
//	
//	@FindAll({
//		@FindBy(id = "user-name"),
//		@FindBy(name="user-name"),
//		@FindBy(xpath = "//input[@placeholder='User-Name']")
//	}) WebElement pwd; // OR
	
	public LoginFactoryPage(WebDriver driver) {
		super(driver);
//		this.driver = driver;
//		PageFactory.initElements(driver, this); // skips driver.findElement , initializes web driver
	}
	 
	public void typeCred(String user, String pass) {
		waitUntilWebEleVisible(username);
		
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	
	public void clicklog() {
		waitUntilWebEleToBeClickable(loginbtn);
		loginbtn.click();
	}
	public String logoDisplay() {
		waitUntilWebEleVisible(logoElement);
		return logoElement.getText();
	}
}
