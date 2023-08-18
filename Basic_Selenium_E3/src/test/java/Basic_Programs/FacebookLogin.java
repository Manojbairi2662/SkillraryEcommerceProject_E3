package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) throws Throwable 
	{
		//managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// maximize the browser
		//driver.manage().window().maximize();
		
		// Entering the URL
		driver.get("https://www.facebook.com/");
		
		//printing the title
		System.out.println(driver.getTitle());
		
		//printing the current URL
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		// closing the current window
		driver.close();

	}

}
