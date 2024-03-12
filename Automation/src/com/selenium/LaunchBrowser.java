package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
 public static void main(String[] args) {
	
	
	 ChromeDriver driver = new  ChromeDriver();
	 
	 //creating object for dimension class
	 Dimension dimension = new Dimension(1000, 200);
	 
	 // set size
	 driver.manage().window().setSize(dimension);
	 
	 //launch application
	 driver.get("https://www.google.com");
	 
	 
}

}
