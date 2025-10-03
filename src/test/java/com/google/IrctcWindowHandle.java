package com.google;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IrctcWindowHandle {
public static void main(String[] args) throws AWTException, InterruptedException {
//	WebDriver driver = new EdgeDriver();
	System.setProperty("webdriver.edge.driver", "C:\\Users\\prsadana\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	EdgeOptions options = new EdgeOptions();
	options.addArguments("--incongnito");
	options.addArguments("--disable-notifications");
	options.addArguments("disable-popup-blocking");
	WebDriver driver = new EdgeDriver(options);
	
	Robot robot = new Robot();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("//button[text()='OK']")).click();
	
	WebElement busClick = driver.findElement(By.cssSelector(".railDrishti.fa.fa-bus"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", busClick);
	busClick.click();
	
	Set<String> handles = driver.getWindowHandles(); // parentid, childid, subchildid
	Iterator it = handles.iterator();
	String parentid = (String) it.next();
	String childid = (String) it.next();
	
	driver.switchTo().window(childid);
	Thread.sleep(2000);
	WebElement goldenChariot = driver.findElement(By.xpath("//div[@class='Nav-icons GoldenChariot']"));
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	wait.until(ExpectedConditions.elementToBeClickable(goldenChariot));
	goldenChariot.click();
	
	List<String> windowids = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windowids.get(2));
	
	driver.quit();
	
}
}
