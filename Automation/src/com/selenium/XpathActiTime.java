package com.selenium;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActiTime {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://laptop-aj0v8qpu/");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//img[@src=\"/img/default/pixel.gif?hash=1692528820\"]")).click();
		
	}
}
