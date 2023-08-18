package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector_Qspider 
{

	public static void main(String[] args)
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
				
		// Entering the URL
		driver.get("https://online.qspiders.com/user");
				
		// maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[placeholder='Enter Email here']")).sendKeys("bairimanojkumar@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder='Enter number here']")).sendKeys("8074444302");
		
		

	}

}
