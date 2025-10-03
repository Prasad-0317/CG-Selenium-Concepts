package com.objectRepo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ObjectRepoTest {
  @Test
  public void testData() throws IOException {
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  
//	  File file = new File("src\\test\\java\\com\\objectRepo\\Object.properties");
//	  FileInputStream fis = new FileInputStream(file);
//	  Properties pro = new Properties();
//	  pro.load(fis);
	  
	  File file = new File("src\\test\\java\\com\\objectRepo\\Object.properties");
	  Properties pro = new Properties();
	  pro.load(new FileInputStream(file));
	  
	  String passEle = pro.getProperty("password");
	  String passValue = pro.getProperty("pwd");
	  
	  driver.findElement(By.xpath(pro.getProperty("username"))).sendKeys(pro.getProperty("uname"));
	  driver.findElement(By.id(passEle)).sendKeys(passValue);
	  driver.findElement(By.id(pro.getProperty("login"))).click();
  }
}
