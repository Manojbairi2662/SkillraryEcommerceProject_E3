package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Program {

	public static void main(String[] args) throws Throwable 
	{
		//managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://www.facebook.com/");
		
		// maximize the browser
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// Navigating  to another URL
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		// Navigating to back page
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		// Navigating to forward page
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		// Navigating to refresh page
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		// close the application
		driver.close();
		

	}

}
