package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_Amazon {

	public static void main(String[] args) {
		// managing drivers
		WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://www.amazon.in/"); 
				
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println("Attribute :"+mobile.getAttribute("class"));
		System.out.println("Attribute :"+mobile.getTagName());

	}

}
