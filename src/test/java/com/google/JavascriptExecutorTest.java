package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavascriptExecutorTest {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	JavascriptExecutor javascriptexec = (JavascriptExecutor)driver;
	javascriptexec.executeScript("location.reload()");
	javascriptexec.executeScript("window.scrollBy(0,500)"); // H,V
	
	driver.switchTo().frame("moneyiframe");
	WebElement searchfield = driver.findElement(By.xpath("//input[@id='query']"));
//	javascriptexec.executeScript("document.getElementById('query').value('motilal');");
	
	javascriptexec.executeScript("arguments[0].setAttribute('value','motilal')", searchfield);
	
	Object object = javascriptexec.executeScript("return arguments[0].getAttribute('value')", searchfield);
	String str = (String)object;
	System.out.println(str);
//	driver.findElement(By.cssSelector(".getqbtn")).click(); 
	
}
}
