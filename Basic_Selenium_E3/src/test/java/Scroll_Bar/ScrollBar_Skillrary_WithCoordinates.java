package Scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar_Skillrary_WithCoordinates {

	public static void main(String[] args) throws Throwable {
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Entering the URL
		driver.get("https://demoapp.skillrary.com/");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement career = driver.findElement(By.xpath("//a[text()='Career']"));
		Point point = career.getLocation();
		int x = point.getX();
		int y = point.getY();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+", "+y+")");
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", career);
	}

}
