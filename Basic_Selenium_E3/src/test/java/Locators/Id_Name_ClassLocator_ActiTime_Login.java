package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_ClassLocator_ActiTime_Login {

	public static void main(String[] args) 
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://demo.actitime.com/login.do");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		// Fetching the address of username text field
		driver.findElement(By.className("textField")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.className("initial")).click();
		
		driver.findElement(By.id("container_users")).click();
	}
}
