package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebPageDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Roshan%20Bawle/OneDrive/Desktop/Selenium/signup.html");
		
		 WebElement multidropdown = driver.findElement(By.id("dropdown"));
		
		 Select s = new Select(multidropdown);
		 
		 for( int i = 0; i<5 ; i++)
		 {
			 s.selectByIndex(i);
			 Thread.sleep(2000);
		 }
		 
		 for(int i = 0 ; i<5 ; i++)
		 {
			 s.deselectByIndex(i);
		 }
		 
		 
		
		
		
		
	}

}
