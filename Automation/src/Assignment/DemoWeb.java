package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWeb {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("shrinivashbawle2000@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Roshan@123");
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'Books')]")).click();
		
		driver.findElement(By.xpath("//h2[@class='product-title']/ancestor::div[@class='product-grid']/descendant::input[@type='button'][1]")).click();
		
		driver.findElement(By.xpath("//a[@class='ico-cart']//descendant::span[@class='cart-label']")).click();
		
		driver.findElement(By.xpath("//td[@class='remove-from-cart']")).click();
		//select the country dropdown
		WebElement country = driver.findElement(By.id("CountryId"));
		country.sendKeys("India");
		driver.findElement(By.name("estimateshipping")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(2000);
		WebElement address1 = driver.findElement(By.id("billing-address-select"));
		
		
	}

}
