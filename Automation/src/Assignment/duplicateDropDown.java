package Assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicateDropDown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("file:///C:/Users/Roshan%20Bawle/OneDrive/Desktop/Selenium/duplicatedropdown.html");
	    
	    Select s = new Select(driver.findElement(By.id("dropdown")));
	    List<WebElement> duplicateoptions = s.getOptions();
	    
	   TreeSet<String> set = new TreeSet<String>();
	   
	   for(int i=0;i<duplicateoptions.size(); i++)
	   {
		   String duplicate = duplicateoptions.get(i).getText();
		   
		   set.add(duplicate);
	   }
	   
	   for(String option : set)
	   {
		   System.out.println(option);
	   }
	   
	}

}
