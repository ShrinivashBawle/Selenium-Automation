package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class paythflightpune{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
		
		//Entering the value in from text field
		driver.findElement(By.id("srcCode")).click();
		
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		
		driver.findElement(By.id("text-box")).sendKeys("PNQ");
		
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		
		//Entering the value in To text field
		driver.findElement(By.id("destCode")).click();
		
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		
		driver.findElement(By.id("text-box")).sendKeys("DEL");
		
		driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
		
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		driver.findElement(By.xpath("(//div[text()='1'])[1]")).click();
		
		
		driver.findElement(By.id("flightSearch")).click();
		
		WebElement flight = driver.findElement(By.xpath("(//span[text()='View Fare']/ancestor::div[@class='_5Cbbf']/descendant::div[@class='_2MkSl'])[1]"));
	
		String FlightTicket = flight.getText();
		
		System.out.println(FlightTicket);
		
		List<WebElement> flightdetails = driver.findElements(By.xpath("//div[@class='M9kpV']"));
		
		for(int i=0;i<flightdetails.size() ; i++)
		{ 
			System.out.println(flightdetails.get(i).getText());
			System.out.println("===================================");
		}
		
	}
}
