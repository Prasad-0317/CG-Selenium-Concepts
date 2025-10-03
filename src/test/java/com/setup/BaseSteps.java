package com.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSteps {
	public static WebDriver driver;
	public static ChromeOptions options;
	public static EdgeOptions edgeoption;
	// we can update/ applying some conditions to browser, customising our own requirements
	
	public static WebDriver chromedriver() {
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incongnito");
		options.addArguments("disable-notifications");
		options.addArguments("disable-popup-blocking");
		options.addArguments("deny-permission-prompts");
		driver = new ChromeDriver(options);
		// implicit wait , url
		
		driver.get("https://www.saucedemo.com/");
		
		return driver;
	}
	public static WebDriver edgedriver() {
		WebDriverManager.edgedriver().setup();
		edgeoption = new EdgeOptions();
		edgeoption.addArguments("--start-maximized");
		edgeoption.addArguments("Incongnito");
		edgeoption.addArguments("disable-notifications");
		edgeoption.addArguments("disable-popup-blocking");
		edgeoption.addArguments("deny-pwrmission-prompts");
		driver = new EdgeDriver(edgeoption);
		driver.get("https://www.saucedemo.com/");
		return driver;
	}
	public static void tearDown(){
		driver.close();
	}
}
