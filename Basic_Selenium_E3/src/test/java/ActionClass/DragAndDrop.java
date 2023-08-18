package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement drop = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		/*act.clickAndHold(drag).perform();
		  act.release(drop).perform();*/
	}

}
