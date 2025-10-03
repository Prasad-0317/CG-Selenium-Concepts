package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Task1_redbus {
	WebDriver driver;
	int count = 0;
	
	 @BeforeTest
	  public void beforeTest() throws AWTException, InterruptedException {
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.redbus.in/");
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		  Robot robot = new Robot();
		  robot.mouseWheel(9);
	  }
	
  @Test
  public void testOffers() throws InterruptedException {

	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  while(count<3) {
		  int current = count+1;
		  String xpath = "//div[@class = 'carousel___cd257e undefined']/div["+current+"]";
		  driver.findElement(By.xpath(xpath)).click();
		  Thread.sleep(2000);
		  WebElement closePopup = driver.findElement(By.cssSelector("#offerClose"));
		  closePopup.click();
		  Thread.sleep(2000);
		  List<String> windowhandle = new ArrayList<>(driver.getWindowHandles());
		  
		  count++;
		  driver.switchTo().window(windowhandle.get(0));
	  }
	  
	  
	  
  }
 

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
