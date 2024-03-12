package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Roshan");
		
		driver.findElement(By.id("LastName")).sendKeys("Bawle");
		
		driver.findElement(By.id("Email")).sendKeys("roshan@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Roshan");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Roshan");
		
		driver.findElement(By.id("register-button")).click();
	}
}
