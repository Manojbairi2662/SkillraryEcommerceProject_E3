package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Popup 
{

	public static void main(String[] args) throws Throwable 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://www.quikr.com/");
		
		// maximize the screen
		driver.manage().window().maximize();

	}

}
