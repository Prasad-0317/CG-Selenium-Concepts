package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopCart extends BasePage{
//	WebDriver driver;
	@FindBy(id = "react-burger-menu-btn") WebElement menu;
	@FindBy(id = "logout_sidebar_link") WebElement logout;
	
	public ShopCart(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
		super(driver);
	}
	public void logOut() throws InterruptedException {
		waitUntilWebEleToBeClickable(menu);
		menu.click();
		waitUntilWebEleToBeClickable(logout);
		logout.click();
	}
}
