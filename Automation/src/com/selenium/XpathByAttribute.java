package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
	
	public static void main(String[] args) {
		
		//launch Browser
        WebDriver driver = new ChromeDriver();
		
        //maximize browser
		driver.manage().window().maximize();
		
		// Launch application
		driver.get("https://demowebshop.tricentis.com/");
		
		// Create Xpath
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	}

}
