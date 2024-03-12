package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vistara {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/in/en");
		
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("delhi");	
		
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		
		driver.findElement(By.xpath("//a[text()='1']")).click();
		
		
		 
		
		
		
	}

}
