package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blikit {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://blinkit.com/");
		//driver.get("https://blinkit.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[@class='btn location-box mask-button']")).click();
		
		
		
	    driver.findElement(By.xpath("//div[text()='Britannia 100% Whole Wheat Bread']")).click(); 
		
	}

}
