package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locators_Naukri {

	public static void main(String[] args) 
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
				
		// Entering the URL
		driver.get("https://www.naukri.com/nlogin/login");
				
		// maximize the screen
		driver.manage().window().maximize();
		
		// Fetching the address of email text field using xpath attribute
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("MAnojkumar");
		
		// Fetching the address of forgot password text field using xpath text
		driver.findElement(By.xpath("//small[text()='Forgot Password?']")).click();

	}

}
