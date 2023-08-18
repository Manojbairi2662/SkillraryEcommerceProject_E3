package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locators {

	public static void main(String[] args) 
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://www.facebook.com/"); 
				
		// maximize the screen
		driver.manage().window().maximize();
		
		// Fetching the address of email text field using xpath attribute
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bairi.manojkumar@gmail.com");
		
		// Fetching the address of password text field using xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Manojkumar121.");
		
		// Fetching the address of forgotten password link with the help of using xpath text
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		// Fetching the address of forgotten password link with the help of using xpath contains text
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
	}

}
