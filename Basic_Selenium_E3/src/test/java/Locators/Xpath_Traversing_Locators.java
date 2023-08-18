package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Traversing_Locators 
{

	public static void main(String[] args)
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
				
		// Entering the URL
		driver.get("https://www.amazon.in/"); 
				
		// maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung phone");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement value = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base a-text-bold a-text-normal')])[3]/../../../.."));
		
		System.out.println(value.getText());


	}

}
