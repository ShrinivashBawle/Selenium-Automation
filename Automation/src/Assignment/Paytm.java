package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launach brwoser
		driver.get("https://paytm.com/");
		//click on flight booking option
		driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
	    // click on location 
		driver.findElement(By.xpath("//span[@class='_38H9z']")).click();
		//click on cancel option
		driver.findElement(By.xpath("//img[@src='//travel-assets-akamai.paytm.com/travel/mweb-flights/assets/7b29a32c.svg']")).click();
		//pass some value
		driver.findElement(By.id("text-box")).sendKeys("Pune");
		//click on actual location
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		
		driver.findElement(By.id("destCode")).click();
		
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		
		driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("Delhi");
		
		driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
		
		driver.findElement(By.id("flightSearch")).click();
		
		
		
		
		
	}

}
