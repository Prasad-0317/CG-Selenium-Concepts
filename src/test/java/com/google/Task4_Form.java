package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4_Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("//textarea")).sendKeys("Capg, Thane");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("983727372782");
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		WebElement moviescheck = driver.findElement(By.cssSelector("#checkbox2"));
		if(!moviescheck.isSelected()) {
			moviescheck.click();
		}
		WebElement cricket = driver.findElement(By.cssSelector("input[id='checkbox1']"));
		if(!cricket.isSelected()) {
			cricket.click();
		}
		
		WebElement lang = driver.findElement(By.id("msdd"));
		lang.click();
		
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//a[text()='Hindi']")).click(); // sometimes error  " org.openqa.selenium.ElementClickInterceptedException:"
		
		WebElement yearbox = driver.findElement(By.cssSelector("select[id=yearbox]"));
		Select yeardrop = new Select(yearbox);
		yeardrop.selectByVisibleText("2003");
		
		WebElement month = driver.findElement(By.cssSelector("select[placeholder=Month]"));
		Select monthdrop = new Select(month);
		monthdrop.selectByVisibleText("December");
		
		WebElement daybox = driver.findElement(By.cssSelector("select[id=daybox]"));
		Select daydrop = new Select(daybox);
		daydrop.selectByVisibleText("17");
		
		WebElement skills = driver.findElement(By.cssSelector("select[id=Skills]"));
		Select skilldrop = new Select(skills);
		skilldrop.selectByVisibleText("C++");
		
		WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
		country.click();
		
		WebElement countryip = driver.findElement(By.xpath("//input[@type='search']"));
		countryip.sendKeys("India");
		countryip.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("firstpassword")).sendKeys("abc@#12");
		driver.findElement(By.id("secondpassword")).sendKeys("abc@#12");
	}

}
