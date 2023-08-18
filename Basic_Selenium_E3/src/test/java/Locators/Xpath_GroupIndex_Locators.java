package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_GroupIndex_Locators 
{

	public static void main(String[] args)
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://www.google.com/"); 
						
		// maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("manoj");
		
		driver.findElement(By.xpath("(//span[text()='Manoj Kumar'])[2]")).click();

	}

}
