package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements_facebook {

	public static void main(String[] args) {
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
		
		WebElement createpage = driver.findElement(By.linkText("Create a Page"));
		
		//Fetching the co-ordinates
		Point Coordinates = createpage.getLocation();
		System.out.println("X and Y cordinates of createpage ");
		System.out.println(Coordinates.getX());
		System.out.println(Coordinates.getY());
		
		//Fetching the Dimension
		Dimension size = createpage.getSize();
		System.out.println("Width and hight of createpage ");
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
		System.out.println("Attribute"+createpage.getAttribute("href"));
		System.out.println("Attribute"+createpage.getTagName());
		
	
		
		

	}

}
