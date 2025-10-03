package com.google;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which browser ?");
		
		String browser = sc.nextLine();
		WebDriver driver = null;
		switch(browser.toLowerCase()) {
		case "edge":
			driver = new EdgeDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		}
		
		driver.get("https://www.google.com");
		String pageTitle = driver.getTitle();
		if(pageTitle.equals("Google")) {
			System.out.println("Page loaded-Pass");
		}
		else {
			System.out.println("Page did not load-Fail");
		}
//		driver.close();// close only one tab
		driver.quit(); // closes all windows and driver
	}

}
