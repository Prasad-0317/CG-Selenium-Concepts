package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
//	WebDriver driver;
	@FindBy(className = "shopping_cart_link") WebElement shopcart;
	@FindBy(id = "add-to-cart-sauce-labs-backpack") WebElement product1;
	public HomePage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
		super(driver);
	}
	public void addProduct() {
		waitUntilWebEleToBeClickable(product1);
		product1.click();
	}
	public void shoppingCart() {
		waitUntilWebEleToBeClickable(shopcart);
		shopcart.click();
	}
}
