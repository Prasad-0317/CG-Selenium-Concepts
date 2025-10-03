package com.google;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SauceDemoLoginExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\prsadana\\eclipse-workspace\\CGSelenium\\ExcelData\\Login_Sauce.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook work = new XSSFWorkbook(fis);
		Sheet sheet = work.getSheetAt(0);
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		int firstRow = sheet.getFirstRowNum();
		int lastRow = sheet.getLastRowNum();
		
		for(int i=firstRow;i<=lastRow;i++) {
			WebElement userinp = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
			userinp.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			WebElement pwdinp = driver.findElement(By.xpath("//*[@id='password']"));
			pwdinp.sendKeys("secret_sauce");
			WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
			loginbtn.click();
			Thread.sleep(500);
			if(!driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
				driver.navigate().to("https://www.saucedemo.com/");
				continue;
			}
			
			Thread.sleep(500);
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(500);
			driver.findElement(By.id("logout_sidebar_link")).click();
		}
		
		work.close();
		fis.close();
	}

}
