package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector_facebook
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
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("bairi.manojkumar@gmail.com");
		
		// Fetching the address of password text field
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Manojkumar121.");
				
		driver.findElement(By.cssSelector("button[name='login']")).click();
		

	}

}
