package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class xpath {
	
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	
	
}

}