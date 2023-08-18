package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_Type {

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
		
		//Fetching the co-ordinates
		Point Coordinates = email.getLocation();
		System.out.println("X and Y cordinates of email textfield are below");
		System.out.println(Coordinates.getX());
		System.out.println(Coordinates.getY());
		
		//Fetching the Dimension
		Dimension size = email.getSize();
		System.out.println("Width and hight of email textfield are below ");
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		

	}

}

