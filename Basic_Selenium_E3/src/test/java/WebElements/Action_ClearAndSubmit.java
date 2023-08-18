package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_ClearAndSubmit 
{

	public static void main(String[] args) throws Throwable
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://www.google.com/"); 
				
		// maximize the screen
		driver.manage().window().maximize();
		
		// Address of email text field
		WebElement search = driver.findElement(By.xpath("//textarea[contains(@name,'q')]"));
		search.sendKeys("test yantra");
		Thread.sleep(2000);
		search.clear();
		search.sendKeys("test yantra");
		search.submit();

	}

}
