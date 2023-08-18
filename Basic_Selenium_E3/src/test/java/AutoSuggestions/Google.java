package AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws Throwable 
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Entering the URL
		driver.get("https://www.google.co.in/webhp?tab=kw");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("samsung");
		
		
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		
		for(WebElement b:list)
		{
			System.out.println(b.getText());
		}

	}

}
