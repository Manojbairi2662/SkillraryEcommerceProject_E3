package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locator_Gmail {

	public static void main(String[] args) 
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&ifkv=AeDOFXhRp0Pmx1x1XKklPMX1vOa6dY4_4Syu_ji06o7s8Ys9HCoEAVNusnGS8JBKEwfrI-bB4j3Heg&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		// Fetching the address of email text field using xpath attribute
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manoj");
		
		// Fetching the address of forgot email using xpath contains attribute
		driver.findElement(By.xpath("//button[contains(@jsname,'Cuz2Ue')]")).click();
		
		// Fetching the address of phone number or email text field using xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@jsname,'YPqjbf')]")).sendKeys("1234");
		
		// Fetching the address of next button using xpath contains attribute
		driver.findElement(By.xpath("//span[contains(@class,'VfPpkd-vQzf8d')]")).click();
		
		
		
		
		
		
		

	}

}
