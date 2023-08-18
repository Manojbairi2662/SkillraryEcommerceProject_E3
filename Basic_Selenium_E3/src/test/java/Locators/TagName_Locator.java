package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// Question : Fetch the all links available in the web page
public class TagName_Locator 
{

	public static void main(String[] args) 
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://www.facebook.com/"); 
						
		// maximize the screen
		driver.manage().window().maximize();
		
		int count = 0; // Number of links count
		
		// Fetching the all links and print the console
		List<WebElement> links = driver.findElements(By.tagName("a")); //links is a variable name
		
		for(WebElement allLinks:links) //alllinks is a variable name
		{
			System.out.println(allLinks.getText());
			
		    count++; // Number of links count
			System.out.println("Total number of links :"+count); // Fetching the total number of the links
		}
	}
}
