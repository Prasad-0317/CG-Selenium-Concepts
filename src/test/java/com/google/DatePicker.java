package com.google;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("datepicker1")).click();
		
		String str = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yearString = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
		while(!str.equals("May")) {
			System.out.println(str +" " + yearString);
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			str = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'12')]")).click();
//		System.out.println();
		
	}

}
