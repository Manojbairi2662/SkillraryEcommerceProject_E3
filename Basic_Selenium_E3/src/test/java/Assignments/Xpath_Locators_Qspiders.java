package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locators_Qspiders 
{

	public static void main(String[] args) throws Throwable 
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://online.qspiders.com/user");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		// Fetching the address of email text field using xpath attribute
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Manoj@email.com");
		
		// Fetching the address of mobile number text field using xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter number here')]")).sendKeys("9784566123");
		
		Thread.sleep(2000);
		
		// Fetching the address of login button using xpath contains attribute
		driver.findElement(By.xpath("//div[contains(@class,'mt-10 mb-16 ml-12 mr-9')]")).click();

	}

}
