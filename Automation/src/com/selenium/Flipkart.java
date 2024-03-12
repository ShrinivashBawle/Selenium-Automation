package com.selenium;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("ipad" , Keys.ENTER);
		
		List<WebElement> ipadlist = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> ipadlist2 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		
	}

}
