package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	
public static void main(String[] args) {
	
	   WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		
	    driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("jeans" ,Keys.ENTER);
	    
	    



		
		

}

}
