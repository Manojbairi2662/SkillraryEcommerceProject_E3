package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verification_Type 
{

	public static void main(String[] args) 
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://www.facebook.com/"); 
				
		// maximize the screen
		driver.manage().window().maximize();
		
		// Address of email text field
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		
		// isDisplayed()
		if (email.isDisplayed())
		{
			email.sendKeys("Manojkumar");
		}
		else
		{
			System.out.println("Element is not displayed");
		}
		// Address of Login button
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		// isEnable()
		if (login.isEnabled())
		{
			login.click();
		}
		else
		{
			System.out.println("Button is enable");
		}
	}

}
