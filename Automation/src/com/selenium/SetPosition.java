package com.selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetPosition {
	
	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		
		//create object for point class
		 Point point = new Point(250, 500);
		
		// set the position
		driver.manage().window().setPosition(point);
		 
		//launch browser
		driver.get("https://www.google.com");
	}

}
