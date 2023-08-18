package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector_Flipkart {

	public static void main(String[] args) 
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://www.flipkart.com/");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		int count = 0; // Number of links count
		
		List<WebElement> links = driver.findElements(By.cssSelector("div")); //links is a variable name

		for(WebElement allLinks:links) //alllinks is a variable name
		{
			System.out.println(allLinks.getText());
			
			count++; // Number of links count
			System.out.println("Total available links is :"+count);  // Fetching the total number of the links

		}
        
	}
}
