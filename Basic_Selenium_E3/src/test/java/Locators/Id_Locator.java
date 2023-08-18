package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Locator {

	public static void main(String[] args) throws Throwable
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://www.amazon.in/");
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// Fetching the address of search text field
		//driver.findElement(By.name("field-keywords")).sendKeys("shoes");
		
		// Fetching the address of search text field
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(2000);
		
		// close the application
		driver.close();
	}
}
