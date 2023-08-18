package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdAndName_Locator 
{
	public static void main(String[] args)
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://www.facebook.com/"); 
		
		// maximize the screen
		driver.manage().window().maximize();
		
		// Fetching the address of email text field
		driver.findElement(By.name("email")).sendKeys("bairi.manojkumar@gmail.com");
		
		// Fetching the address of password text field
		driver.findElement(By.name("pass")).sendKeys("Manojkumar121.");
		
		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();

	}
}
