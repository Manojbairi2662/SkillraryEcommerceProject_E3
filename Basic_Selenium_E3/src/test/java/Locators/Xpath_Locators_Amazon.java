package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locators_Amazon {

	public static void main(String[] args) throws Throwable
	{
		// managing drivers
        WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
				
		// Entering the URL
		driver.get("https://www.amazon.in/"); 
				
		// maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@name,'field-keywords')]")).sendKeys("samsung mobiles");
		
		driver.findElement(By.xpath("//div[contains(@class,'nav-search-submit nav-sprite')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[2]/../../../..")).submit();
	}

}
