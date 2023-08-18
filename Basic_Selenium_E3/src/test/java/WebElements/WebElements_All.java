package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements_All {

	public static void main(String[] args) throws Throwable {
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
		
		//xpath by contains Attribute
        WebElement logo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
		
      //Fetching the Dimension
        Dimension size = logo.getSize();
        System.out.println("The size of facebook logo is ");
        System.out.println(size.getHeight());
        System.out.println(size.getWidth());
        
		//Fetching the co-ordinates
        Point cordinates = logo.getLocation();
		System.out.println("The facebook logo location is ");
		System.out.println(cordinates.getX());
		System.out.println(cordinates.getY());
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("Manojkumar");
		Thread.sleep(2000);
		email.clear();
		
	}

}
