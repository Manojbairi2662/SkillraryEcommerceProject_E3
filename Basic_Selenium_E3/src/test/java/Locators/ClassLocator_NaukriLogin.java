package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassLocator_NaukriLogin {

	public static void main(String[] args) throws Throwable 
	{
		// managing drivers
        WebDriverManager.chromedriver().setup();
		
       // opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://www.naukri.com/nlogin/login");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// Fetching the address of email text field
		driver.findElement(By.id("usernameField")).sendKeys("bairi.manojkumar@gmail.com");
		
		// Fetching the address of password text field
		driver.findElement(By.className("pr-60")).sendKeys("8074444302");
		
	}
}
